package com.gzy.springboot_user_manager.service;

import com.gzy.springboot_user_manager.pojo.User;
import com.gzy.springboot_user_manager.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 添加用户
     * @param user 用户信息
     * @return 添加成功的用户信息
     */
    User add(UserDto user);
}
