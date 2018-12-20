package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.Role;
import com.blossom.sagittarius.domain.security.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoleDao {

    List<Role> listByUsername(String username);

    Role createRole(Role role);

    /*void createRoleForUser(UserRole userRole);*/
}
