package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserService {
    private UserDao userDao;

    public void add() {
        System.out.println("service add...............");
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
