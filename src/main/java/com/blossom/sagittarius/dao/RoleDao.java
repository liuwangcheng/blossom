package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.Role;
import com.blossom.sagittarius.domain.security.UserRole;

import java.util.List;

public interface RoleDao {

    List<Role> listByUsername(String username);

    Role createRole(Role role);

    void createRoleForUser(UserRole userRole);
}
