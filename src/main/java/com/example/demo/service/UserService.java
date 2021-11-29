package com.example.demo.service;

import com.example.demo.bean.UserBean;

// 业务接口类
public interface UserService {
    UserBean loginIn(String username, String password);
}
