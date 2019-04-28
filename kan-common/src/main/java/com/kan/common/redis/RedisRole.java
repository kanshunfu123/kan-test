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
public class RedisRole {
    /**
     * sysRoleStatus 是否被禁用  0否 1禁用.
     */
    private String sysRoleStatus;
    /**
     * groupId 第三方组 小为默认为1.
     */
    private Long groupId;
    private Long id;

    /**
     * delFlag 删除状态(0-正常，1-删除).
     */
    private String delFlag;

    /**
     * sysRoleName 角色名称.
     */
    private String sysRoleName;
    /**
     * sysRoleType 角色的类型，0：管理员角色，1：普通用户 2其他.
     */
    private String sysRoleType;
}
