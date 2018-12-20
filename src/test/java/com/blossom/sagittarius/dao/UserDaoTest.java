package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    public void findByUsername() {
        System.out.print(userDao.findByUsername("李小龙"));
    }

    @Test
    public void findByEmail() {
        System.out.print(userDao.findByEmail("1125485579@qq.com"));
    }
    @Test
    public void findAll() {
        List<User> userList = this.userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("王小龙");
        user.setPassWord("12345");
        user.setFirstName("王");
        user.setLastName("小龙");
        user.setEmail("18119615680@163.com");
        user.setPhone(12378);
        user.setEnabled("0");
        user.setUserRoles("游客");
        user.setCreditcardId(1);
        userDao.saveUser(user);
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
        user.setId(4);
        this.userDao.updateUser(user);

    }

    @Test
    public void deleteUserById() {
        this.userDao.deleteUserById(11);
    }
}