package com.hotstrip.dubbo.api.service;

import com.hotstrip.dubbo.api.entity.User;

public interface UserService {
    // find by userId
    User findByUserId(final int userId);

    // insert user
    User insert(final User info);

}
