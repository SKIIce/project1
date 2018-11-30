package com.example.dubbo.service;

import com.example.demain.User;

public interface UserService {
    User queryUserById(Long id);

    String showMsg(String msg);
}
