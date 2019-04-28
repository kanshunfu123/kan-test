package com.kan.common.redis;

import lombok.*;

/**
 * Created by MOMO on 2019/1/7.
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RedisUser {
    /**
     * isForbidden 是否被禁用  0否 1禁用.
     */
    private String isForbidden;

    //redis的随机数
    private String redisUserKey;
    /**
     * id 主键.
     */
    private Long id;
    /**
     * deptId 关联部门id.
     */
    private Long deptId;
    /**
     * groupId 第三方组 小为默认为1
     */
    private Long groupId;

    /**
     * roleType 冗余角色类型 0管理员(专为第三方老板而设置） 1普通员工
     */
    private String roleType;

    /**
     * sysUserName 姓名.
     */
    private String sysUserName;

    /**
     * sysUserEmail 邮箱.
     */
    private String sysUserEmail;
    /**
     * sysUserPhone 手机号.
     */
    private String sysUserPhone;
    /**
     * sysLoginNumber 账号允许登录的次数 -1 不限次数 ，如需登录次数为0，请禁用该账号，减少代码复杂度.
     */
    private String sysLoginNumber;

    /**
     * sysUserLoginName 登录名.
     */
    private String sysUserLoginName;

}
