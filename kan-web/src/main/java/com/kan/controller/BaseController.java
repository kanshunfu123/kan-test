package com.kan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.kan.common.redis.RedisUser;
import com.kan.common.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by MOMO on 2019/1/8.
 */
@Slf4j
public class BaseController {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     * 由网关 传入最新的user信息
     *
     * @param userInfo
     * @return
     */
    public RedisUser redisUser(String userInfo) throws UnsupportedEncodingException {
        String bb = URLDecoder.decode(userInfo, "UTF-8");
        RedisUser redisUser = JSON.parseObject(bb, new TypeReference<RedisUser>() {
        });
        return redisUser;
    }

    /**
     * 用户登录时，存入jwt信息，更新用户无法，更新jwt
     *
     * @param token
     * @return
     */
    public RedisUser jwtUser(String token) {
        String tok = jwtTokenUtil.getUsernameFromToken(token);
        RedisUser redisUser = JSON.parseObject(tok, new TypeReference<RedisUser>() {
        });
        return redisUser;
    }

}
