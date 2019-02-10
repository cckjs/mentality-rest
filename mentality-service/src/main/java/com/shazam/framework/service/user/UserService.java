package com.shazam.framework.service.user;

import com.shazam.framework.entity.user.User;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
public interface UserService {

    /**
     * 用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User getUser(String username, String password);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
}
