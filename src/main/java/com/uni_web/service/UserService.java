package com.uni_web.service;

import com.uni_web.entity.User;
import com.uni_web.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    void save(WebUser webUser);

}
