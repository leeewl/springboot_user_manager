package com.gzy.springboot_user_manager.controller;

import com.gzy.springboot_user_manager.pojo.ResponseMessage;
import com.gzy.springboot_user_manager.pojo.User;
import com.gzy.springboot_user_manager.pojo.dto.UserDto;
import com.gzy.springboot_user_manager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //接口方法返回对象，转换为json文本
@RequestMapping("/user") //请求路径 localhost:8083/user
public class UserController {
    @Autowired
    IUserService userService;
    // REST
    // 增加
    @PostMapping // URL: localhost:8083/user method: POST
    /*
     接收参数一般用DTO对象
     @RequestBody注解将json数据绑定到对象中
     @Validated注解校验参数
     */
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user){
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }

    // 查询 @GetMapping
    @GetMapping("/{userId}") // URL: localhost:8083/user/1 method: get
    public ResponseMessage<User> getUser(@PathVariable Integer userId){
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    // 修改
    @PutMapping
    public ResponseMessage<User> edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }

    // 删除
    @DeleteMapping("/{userId}")
    public ResponseMessage<String> delete(@PathVariable Integer userId) {
        userService.delete(userId);
        return ResponseMessage.success();
    }
}
