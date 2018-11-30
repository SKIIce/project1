package com.example.demodubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demain.User;
import com.example.dao.UserRepository;
import com.example.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User queryUserById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.get();
    }

    @Override
    public String showMsg(String msg) {
        return "dubboService[2]: " + msg;
    }
}
