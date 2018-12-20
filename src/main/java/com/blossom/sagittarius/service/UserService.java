package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.User;
import com.blossom.sagittarius.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);

    User findByUsername(String username);

    User findByEmail (String email);

    User save(User user);

    User queryUserById(Integer id);

}
