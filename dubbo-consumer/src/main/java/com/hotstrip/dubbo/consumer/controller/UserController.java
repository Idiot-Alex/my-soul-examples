package com.hotstrip.dubbo.consumer.controller;

import com.hotstrip.dubbo.api.entity.User;
import com.hotstrip.dubbo.api.service.UserService;
import com.hotstrip.dubbo.api.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping(value = "/user/{userId}")
    public String findByUserId(@PathVariable("userId") final int userId) {
        User user = userService.findByUserId(userId);
        return GsonUtil.classToString(user);
    }
}
