package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.UserDO;

public interface UserDODao {

    void createUser(UserDO userDO);

    UserDO getByUsername(String username);
}
