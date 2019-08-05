package com.redis.demo.service;

import com.redis.demo.entity.Address;
import com.redis.demo.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * @Name DemoService
 * @Description TODO
 * @Author zz
 * @Date 2019/8/5  16:36
 * @Version 1.0
 **/
@Service
public class DemoService {
    /*
     * @Author zz
     * @Description @Cacheable
     * 其中value表示该方法返回的参数的缓存存在那个Cache里(即为缓存块的名字)
     * 缓存结果以一个键值对存放在缓存中,注解中key即为键值对的key;value即为方法返回的结果
     *  key用双引号,里面#加上方法的参数:获取方法的参数,  ''表示在参数之间添加分隔符
     * @Date 17:11 2019/8/5
     **/
    
    @Cacheable(value = "usercache")
    public User findUser(Long id, String firstName, String lastName){
        System.out.println("无缓存——————>调用数据库");
        return new User(id,firstName,lastName);
    }
    @Cacheable(value = "addresscache")
    public Address findAddress(Long id, String province, String city){
        System.out.println("无缓存——————>调用数据库");
        return new Address(id,province,city);
    }
}
