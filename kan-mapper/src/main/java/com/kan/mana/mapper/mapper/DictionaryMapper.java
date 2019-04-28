package com.kan.mana.mapper.mapper;

import com.kan.mana.mapper.resultmap.DictionaryTreeResult;

import java.util.List;

/**
 * Created by kanshunfu on 2019/01/07.
 */
public interface DictionaryMapper {
    /**
     * 查看字典树
     * @return
     */
    public List<DictionaryTreeResult> DictionaryTree();


}

