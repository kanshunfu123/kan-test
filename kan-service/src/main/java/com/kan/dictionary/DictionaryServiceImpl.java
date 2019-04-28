package com.kan.dictionary;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.kan.common.common.JSONResult;
import com.kan.common.util.LevelUtil;
import com.kan.common.vo.DictionaryTreeVo;
import com.kan.mana.mapper.mapper.DictionaryMapper;
import com.kan.mana.mapper.resultmap.DictionaryTreeResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kanshunfu on 2019/01/07.
 */
@Service
@Slf4j
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;


    @Override
    public JSONResult dictionaryTreeList() {


        //递归树最终结果集
        //将deptList拷贝到dtoList
        List<DictionaryTreeVo> dictionaryTreeVo = new ArrayList<>(0);
        //得到所有字典
        List<DictionaryTreeResult> dicVos = dictionaryMapper.DictionaryTree();
        if (dicVos != null && dicVos.size() != 0) {
            dicVos.forEach(dicEntity -> {
                //去除被删除的字典
                if (dicEntity.getDelFlag().equals("0")) {
                    DictionaryTreeVo treeRes = new DictionaryTreeVo();
                    BeanUtils.copyProperties(dicEntity, treeRes);
                    dictionaryTreeVo.add(treeRes);
                }
            });
        }

        return JSONResult.ok(dicMenuToTree(dictionaryTreeVo));

    }


    public List<DictionaryTreeVo> dicMenuToTree(List<DictionaryTreeVo> resList) {
        //集合为空直接返回
        if (CollectionUtils.isEmpty(resList)) {
            return Lists.newArrayList();
        }
        //可以放相同的key，比普通的map高级
        //把当前的tree以level为key 相同level的字典作为value，放到map里
        // level->[dictionary1,dictionary2,....]
        Multimap<String, DictionaryTreeVo> levelDeptMap = ArrayListMultimap.create();
        //用来保存第一层级的树,同时也是最终的字典树
        List<DictionaryTreeVo> rootList = Lists.newArrayList();
        for (DictionaryTreeVo treeRes : resList) {
            levelDeptMap.put(treeRes.getCodeLevel(), treeRes);
            if (LevelUtil.ROOT.equals(treeRes.getCodeLevel())) {
                rootList.add(treeRes);
            }
        }
        //按照 serial_number 从小到大 对字典树进行排序
        Collections.sort(rootList, new Comparator<DictionaryTreeVo>() {
            @Override
            public int compare(DictionaryTreeVo o1, DictionaryTreeVo o2) {
                return o1.getSysDictionarySeq() - o2.getSysDictionarySeq();
            }
        });
        //递归生成树
        transformDeptTree(rootList, LevelUtil.ROOT, levelDeptMap);
        return rootList;
    }

    private void transformDeptTree(List<DictionaryTreeVo> dicLevelList, String level, Multimap<String, DictionaryTreeVo> levelDeptMap) {
        int size = dicLevelList.size();
        for (int i = 0; i < size; i++) {
            //遍历该层的每个元素
            DictionaryTreeVo dicMenuDto = dicLevelList.get(i);
            //处理当前层级的数据
            String nexeLevel = LevelUtil.calculateLevelString(level, dicMenuDto.getId());
            //处理下一层
            List<DictionaryTreeVo> tempDeptList = (List<DictionaryTreeVo>) levelDeptMap.get(nexeLevel);
            if (!CollectionUtils.isEmpty(tempDeptList)) {
                //排序
                Collections.sort(tempDeptList, dicSerialNumberComparator);
                //设置下一层字典
                dicMenuDto.setChildren(tempDeptList);
                //进入到下一层处理
                transformDeptTree(tempDeptList, nexeLevel, levelDeptMap);
            }
        }
    }

    public Comparator<DictionaryTreeVo> dicSerialNumberComparator = new Comparator<DictionaryTreeVo>() {
        @Override
        public int compare(DictionaryTreeVo o1, DictionaryTreeVo o2) {
            return o1.getSysDictionarySeq() - o2.getSysDictionarySeq();
        }
    };

    //list去重
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
       for(int i=0;i<list.size()-1;i++){
           for(int j=list.size()-1;j>i;j--){
               if(list.get(j).equals(list.get(i))){
                   list.remove(j);
               }
           }
       }
        System.out.println(list);
    }
}

