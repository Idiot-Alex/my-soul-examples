package com.hotstrip.httpdemo.web;

import com.hotstrip.httpdemo.dto.User;
import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * user controller
 * @author Hotstrip
 */
@RestController
public class UserController {

    /**
     * get user by id
     * @param id
     * @return
     */
    @GetMapping(value = "/user/{id}")
    @SoulSpringMvcClient(path = "/user/*", desc = "get user by id")
    public Object getUserById(@PathVariable(value = "id") Long id) {
        User info = new User();
        info.setId(id);
        info.setName("name" + id);
        return info;
    }

    /**
     * get user list
     * @return
     */
    @GetMapping(value = "/user/list")
    @SoulSpringMvcClient(path = "/user/list", desc = "get user list")
    public Object getUserList() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User info = new User();
            info.setId(Long.valueOf(i));
            info.setName("name" + i);
            list.add(info);
        };
        return list;
    }
}
