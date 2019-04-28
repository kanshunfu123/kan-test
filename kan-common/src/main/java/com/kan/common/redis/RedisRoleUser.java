package com.kan.common.redis;

import lombok.*;

/**
 * Created by MOMO on 2019/1/12.
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RedisRoleUser {
    /**
     * id ID.
     */
    private Long id;
    /**
     * roleId 角色id.
     */
    private Long roleId;
    /**
     * userId 用户id.
     */
    private Long userId;
    /**
     * groupId 第三方组 小为默认为1.
     */
    private Long groupId;



}
