package com.gzy.springboot_user_manager.controller;

import com.gzy.springboot_user_manager.pojo.dto.UserDto;
import com.gzy.springboot_user_manager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //接口方法返回对象，转换为json文本
@RequestMapping("/user") //请求路径 localhost:8083/user
public class UserController {
    @Autowired
    IUserService userService;
    // REST
    // 增加
    @PostMapping // URL: localhost:8083/user method: POST
    public String add(@RequestBody UserDto user){ // 接收参数一般用DTO对象, @RequestBody注解将json数据绑定到对象中
        userService.add(user);
        return "SUCCESS!";
    }

    // 查询 @GetMapping

    // 修改 @PutMapping

    // 删除 @DeleteMapping


}
