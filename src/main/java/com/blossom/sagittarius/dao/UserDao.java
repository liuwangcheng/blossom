package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserDao {

    /**
     * 通过Id查询
     * @param id
     * @return
     */
    User queryUserById(@Param("Id") Integer id);

    /**
     * 通过username查询
     * @param username
     * @return
     */
    User findByUsername(@Param("userName") String username);

    /**
     * 通过email查询
     * @param email
     * @return
     */
    User findByEmail(@Param("Email")String email);


    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    /**
     * 新增用户信息
     * @param user
     */
    public User  saveUser(User user);

    /**
     * 根据id更新用户信息
     * @param user
     */
    public int updateUser(User user);

    /**
     * 根据id删除用户信息
     * @param id
     */
    public int deleteUserById(@Param("Id")Integer id);

}
