package com.kan.common.redis;

import lombok.*;

/**
 * Created by MOMO on 2019/1/11.
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RedisAclModue {
    /**
     * sysAclModuleUuid 唯一，32位字符串，查询用.
     */
    private String sysAclModuleUuid;
    /**
     * id 权限模块id.
     */
    private Long id;
    /**
     * sysAclModuleParentId 上级权限模块id.
     */
    private Long sysAclModuleParentId;
    /**
     * sysAclPermissionType 菜单系统类型 1 系统管理 2资产管理.
     */
    private Long sysAclPermissionType;
    /**
     * delFlag 删除状态(0-正常，1-删除).
     */
    private String delFlag;

    /**
     * sysAclModuleName 权限模块名称.
     */
    private String sysAclModuleName;

    /**
     * sysAclModuleLevel 权限模块层级.
     */
    private String sysAclModuleLevel;

    /**
     * sysAclModuleSeq 权限模块在当前层级下的顺序，由小到大.
     */
    private Integer sysAclModuleSeq;

}
