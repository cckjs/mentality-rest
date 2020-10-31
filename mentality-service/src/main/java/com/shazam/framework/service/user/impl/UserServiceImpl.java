package com.shazam.framework.service.user.impl;

import java.util.HashMap;
import java.util.Map;

import com.shazam.framework.dao.user.UserDao;
import com.shazam.framework.entity.user.User;
import com.shazam.framework.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String username) {
        return userDao.findUserByUserName(username);
    }

    @Override
    public void addUser(User user) {
         userDao.save(user);
    }
}
