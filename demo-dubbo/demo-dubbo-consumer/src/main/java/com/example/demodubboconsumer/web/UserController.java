package com.example.demodubboconsumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference
    private UserService userService;

    @GetMapping("user/{id}")
    public Object queryUser(@PathVariable Long id){
        return userService.queryUserById(id);
    }

    @GetMapping("msg/{msg}")
    public String showMsg(@PathVariable("msg") String msg){
        return userService.showMsg(msg);
    }
}
