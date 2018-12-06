package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void queryUserById() {
        System.out.print(userDao.queryUserById(1));
    }
    @Test
    public void queryUserAll() {
        List<User> userList = this.userDao.queryUserAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("李小龙");
        user.setPassWord("1234");
        user.setFirstName("李");
        user.setLastName("小龙");
        user.setEmail("18119615680@163.com");
        user.setPhone(12345678);
        user.setEnabled("1");
        user.setUserRoles("游客");
        user.setCreditcardId(2);
        this.userDao.insertUser(user);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setUserName("刘德华");
        user.setPassWord("12345");
        user.setFirstName("刘");
        user.setLastName("德华");
        user.setEmail("1125485579@qq.com");
        user.setPhone(1234);
        user.setId(2);
        this.userDao.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        this.userDao.deleteUserById(3);
    }
}