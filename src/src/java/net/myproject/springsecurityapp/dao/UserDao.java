package net.myproject.springsecurityapp.dao;

import net.myproject.springsecurityapp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JPARepository {
    User findByUsername(String username);
}
