package com.redis.demo.controller;

import com.redis.demo.entity.Address;
import com.redis.demo.entity.User;
import com.redis.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name TestController
 * @Description TODO
 * @Author zz
 * @Date 2019/8/5  16:34
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DemoService demoService;



    @RequestMapping("/test1")
    @ResponseBody
    public String putCache(){
        demoService.findUser(2l,"AAAA","CCCCC");
        demoService.findAddress(2l,"BBBB","DDDD");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return "ok";
    }
    @RequestMapping("/test2")
    @ResponseBody
    public String testCache(){
        User user = demoService.findUser(2l,"AAAA","CCCCC");
        Address address =demoService.findAddress(2l,"BBBB","DDDD");
        System.out.println("我这里没执行查询");
        System.out.println("user:"+"/"+user.getFirstName()+"/"+user.getLastName());
        System.out.println("address:"+"/"+address.getProvince()+"/"+address.getCity());
        return "ok";
    }
}
