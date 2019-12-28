package com.zking.eurekaprovider.server;

public interface RedisService {

    void setObj(String key, Object obj, long timeout);

    Object getObj(String key);

}