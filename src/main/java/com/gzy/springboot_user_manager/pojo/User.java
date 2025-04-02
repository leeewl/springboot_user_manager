package com.gzy.springboot_user_manager.pojo;

import jakarta.persistence.*;

@Table(name="tb_user") // 映射到数据库的表名为tb_user
@Entity
public class User {
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    @Column(name = "user_id") // 映射到数据库的列名为user_id
    private Integer userId;
    @Column(name = "user_name")// 映射到数据库的列名为user_name
    private String userName;
    private String password;
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
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}