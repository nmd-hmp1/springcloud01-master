package com.zking.eurekaprovider.server.imp;



import com.zking.eurekaprovider.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void setObj(final String key, Object obj, long timeout) {
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        operations.set(key, obj, timeout, TimeUnit.SECONDS);
    }

    @Override
    public Object getObj(final String key) {
        Object o = redisTemplate.opsForValue().get(key);
        return o;
    }


}