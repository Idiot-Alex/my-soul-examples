package com.hotstrip.dubbo.provider.service;

import com.hotstrip.dubbo.api.entity.User;
import com.hotstrip.dubbo.api.service.UserService;
import com.hotstrip.dubbo.api.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByUserId(int userId) {
        User user = new User();
        user.setUserId(userId);
        user.setName("name: " + userId);
        return user;
    }

    @Override
    public User insert(User info) {
        return info;
    }
}
