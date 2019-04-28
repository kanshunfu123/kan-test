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
public class RedisAcl {
    /**
     * id 权限id.
     */
    private Long id;
    /**
     * sysAclModuleId 权限所在的权限模块id.
     */
    private Long sysAclModuleId;
    /**
     * sysAclPermissionType 菜单系统类型 1 系统管理 2资产管理.
     */
    private Long sysAclPermissionType;
    /**
     * name 页面名称(前端控制).
     */
    private String name;


    /**
     * sysAclUrl 请求的url, 可以填正则表达式.
     */
    private String sysAclUrl;

    /**
     * sysAclName 权限名称.
     */
    private String sysAclName;
    /**
     * sysAclType 类型，1：菜单，2：按钮，3：其他.
     */
    private String sysAclType;

    /**
     * sysAclAction 按钮动作类型(交给前端处理）.
     */
    private String sysAclAction;
    /**
     * sysAclRouter 所属页面(交给前端处理).
     */
    private String sysAclRouter;
    /**
     * sysAclStatus 状态 0启用  1禁用.
     */
    private String sysAclStatus;
    /**
     * sysAclSeq 权限在当前模块下的顺序，由小到大.
     */
    private Integer sysAclSeq;

}
