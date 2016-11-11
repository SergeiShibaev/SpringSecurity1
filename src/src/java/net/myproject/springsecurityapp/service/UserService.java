package net.myproject.springsecurityapp.service;

import net.myproject.springsecurityapp.pojo.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
