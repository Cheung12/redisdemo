package com.redis.demo.entity;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;

/**
 * @Name User
 * @Description Redis 需要序列化对象
 * @Author zz
 * @Date 2019/8/5  16:35
 * @Version 1.0
 **/
@Data
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;

    public User(Long id,String firstName, String lastName) {
        this.id = id ;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
