package net.myproject.springsecurityapp.dao;

import net.myproject.springsecurityapp.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
