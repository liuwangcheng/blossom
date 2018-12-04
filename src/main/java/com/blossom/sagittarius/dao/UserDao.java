package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.UserDO;
import com.blossom.sagittarius.domain.security.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {

    public User queryUserById(String id);
    void createUser(UserDO userDO);

    UserDO getByUsername(String username);

}
