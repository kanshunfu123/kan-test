package com.kan.mana.mapper.resultmap;

public class DictionaryTreeResult {
    /**
     * id ID.
     */
    private Long id;
    /**
     * parentId 上级id.
     */
    private Long parentId;
    /**
     * delFlag 删除状态(0-正常，1-删除).
     */
    private String delFlag;
    /**
     * codeName 代码名称.
     */
    private String codeName;

    /**
     * sysDictionarySeq 字典在当前层级下的顺序，由小到大.
     */
    private Integer sysDictionarySeq;
    /**
     * codeLevel 字典层级.
     */
    private String codeLevel;
    /**
     * sysDictionaryUuid 唯一，32位字符串，查询用.
     */
    private String sysDictionaryUuid;
    /**
     * 代码值
     */
    private Long codeValue;

    public Long getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(Long codeValue) {
        this.codeValue = codeValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Integer getSysDictionarySeq() {
        return sysDictionarySeq;
    }

    public void setSysDictionarySeq(Integer sysDictionarySeq) {
        this.sysDictionarySeq = sysDictionarySeq;
    }

    public String getCodeLevel() {
        return codeLevel;
    }

    public void setCodeLevel(String codeLevel) {
        this.codeLevel = codeLevel;
    }

    public String getSysDictionaryUuid() {
        return sysDictionaryUuid;
    }

    public void setSysDictionaryUuid(String sysDictionaryUuid) {
        this.sysDictionaryUuid = sysDictionaryUuid;
    }
}
