package com.uni_web.dao;

import com.uni_web.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
