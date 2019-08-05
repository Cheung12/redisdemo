package com.redis.demo.entity;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;

/**
 * @Name Address
 * @Description Redis 需要序列化对象
 * @Author zz
 * @Date 2019/8/5  16:28
 * @Version 1.0
 **/
@Data
public class Address implements Serializable {
    private Long id;
    private String province;
    private String city;

    public Address(Long id,String province, String city) {
        this.id = id;
        this.province = province;
        this.city = city;
    }
}
