package com.gzy.springboot_user_manager.pojo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class UserDto {

    private Integer userId;
    @NotBlank(message="用户名不能为空") //去除空格
    private String userName;
    @NotBlank(message="密码不能为空") //去除空格
    @Length(min=6,max=12,message="密码长度必须在6-12位之间")
    private String password;
    @Email(message="邮箱格式不正确")
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
