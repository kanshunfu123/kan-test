package com.kan.mana.mapper.mapper;

import com.kan.mana.mapper.dataobject.DictionaryDataDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 * The Table SYS_DICTIONARY_DATA.
 * 数据字典
 */
public interface DictionaryDataDOMapper{

    /**
     * desc:插入表:SYS_DICTIONARY_DATA.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SYS_DICTIONARY_DATA( PARENT_ID ,CODE_VALUE ,DEL_FLAG ,CODE_NAME ,CREATE_BY ,UPDATE_BY ,CODE_LEVEL ,SYS_DICTIONARY_UUID ,SYS_DICTIONARY_REMARK ,SYS_DICTIONARY_SEQ ,CREATE_TIME ,UPDATE_TIME )VALUES( #{parentId,jdbcType=BIGINT} ,#{codeValue,jdbcType=BIGINT} ,#{delFlag,jdbcType=CHAR} ,#{codeName,jdbcType=VARCHAR} ,#{createBy,jdbcType=VARCHAR} ,#{updateBy,jdbcType=VARCHAR} ,#{codeLevel,jdbcType=VARCHAR} ,#{sysDictionaryUuid,jdbcType=VARCHAR} ,#{sysDictionaryRemark,jdbcType=VARCHAR} ,#{sysDictionarySeq,jdbcType=INTEGER} ,#{createTime,jdbcType=TIMESTAMP} ,#{updateTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return int
     */
    int insert(DictionaryDataDO entity);
    /**
     * desc:更新表:SYS_DICTIONARY_DATA.<br/>
     * descSql =  UPDATE SYS_DICTIONARY_DATA SET PARENT_ID = #{parentId,jdbcType=BIGINT} ,CODE_VALUE = #{codeValue,jdbcType=BIGINT} ,DEL_FLAG = #{delFlag,jdbcType=CHAR} ,CODE_NAME = #{codeName,jdbcType=VARCHAR} ,CREATE_BY = #{createBy,jdbcType=VARCHAR} ,UPDATE_BY = #{updateBy,jdbcType=VARCHAR} ,CODE_LEVEL = #{codeLevel,jdbcType=VARCHAR} ,SYS_DICTIONARY_UUID = #{sysDictionaryUuid,jdbcType=VARCHAR} ,SYS_DICTIONARY_REMARK = #{sysDictionaryRemark,jdbcType=VARCHAR} ,SYS_DICTIONARY_SEQ = #{sysDictionarySeq,jdbcType=INTEGER} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return int
     */
    int update(DictionaryDataDO entity);
    /**
     * desc:根据主键删除数据:SYS_DICTIONARY_DATA.<br/>
     * descSql =  DELETE FROM SYS_DICTIONARY_DATA WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return int
     */
    int deleteById(Long id);
    /**
     * desc:根据主键获取数据:SYS_DICTIONARY_DATA.<br/>
     * descSql =  SELECT * FROM SYS_DICTIONARY_DATA WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return DictionaryDataDO
     */
    DictionaryDataDO getById(Long id);
}
