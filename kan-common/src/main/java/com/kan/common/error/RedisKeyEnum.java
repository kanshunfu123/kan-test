package com.kan.common.error;

/**
 * Created by MOMO on 2018/9/14.
 */
public enum RedisKeyEnum {

    //
    REDIS_KEY_IMG_UUID_CODE("verUUidCode:", 60*2, "图片验证码"),
    //
    REDIS_KEY_IMG_UUID_CODE_HEADER("verUUidCode", 60, "图片验证码唯一uuid放在header里"),
    //
    REDIS_KEY_USER_INFO("userInfo:", 60 * 60*3, "用户登录"),
    //
    REDIS_KEY_USER_LIST_INFO("userList:", 60 * 60*3+2, "用户登录，限制登录次数"),
    //
    REDIS_KEY_HEADER_INFO("X-Token", 60 * 60*15, "给前端的header"),
    //
    REDIS_KEY_FOOR_INFO("ec:", -1,"电梯对象"),
    //
    REDIS_KEY_CW_INFO("cw:", -1,"饮用水对象"),
    //
    REDIS_KEY_MH_INFO("mh:", -1,"井盖对象"),
    //
    REDIS_KEY_RW_INFO("rw:", -1,"地表水对象"),
    //
    REDIS_KEY_ES_INFO("es:", -1,"电梯场景对象"),
    //
    REDIS_KEY_CS_INFO("cs:", -1,"饮用水场景对象"),
    //
    REDIS_KEY_MS_INFO("ms:", -1,"井盖场景对象"),
    //
    REDIS_KEY_RS_INFO("rs:", -1,"地表水场景对象"),
    //
    REDIS_USER_INFO("user:",-1,"用户信息,实时更新"),
    //
    REDIS_ROLE_INFO("role:",-1,"角色信息,实时更新"),
    //
    REDIS_ADMIN_ROLE_INFO("adminRole:",-1,"管理员角色角色信息,实时更新"),
    //
    REDIS_ACL_MODULE_INFO("aclMo:",-1,"权限模块信息,实时更新"),
    //
    REDIS_MAP_ACL_MODULE_INFO("mapAclMo:",-1,"权限模块Map信息,实时更新"),
    //
    REDIS_ACL_ACL_INFO("acl:",-1,"权限点信息,实时更新"),
    //
    REDIS_MAP_ACL_INFO("mapAcl:",-1,"权限点Map信息 Map<Object, Object>,实时更新"),
    //
    REDIS_USER_ROLE_INFO("userRole:",-1,"用户和角色信息 List<Long>,实时更新"),
    //
    REDIS_ROLE_ACL_INFO("roleAcl:",-1,"角色和权限点信息 List<Long> ,实时更新"),
    REDIS_ROLE_DEVICE_INFO("roleDevice:",-1,"角色和设备信息 List<Long> ,实时更新"),

    REDIS_GROUP_ACL_INFO("groupAcl:",-1,"第三方组和权限点信息 List<Long> ,实时更新"),
    ;
    private final String key;
    private final int expireTime;
    private final String keyInfo;


    RedisKeyEnum(String key, int expireTime, String keyInfo) {
        this.key = key;
        this.expireTime = expireTime;
        this.keyInfo = keyInfo;
    }


    public String getKey() {
        return key;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public String getKeyInfo() {
        return keyInfo;
    }
}
