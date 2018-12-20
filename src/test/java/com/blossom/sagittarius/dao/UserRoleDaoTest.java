package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleDaoTest {
    @Autowired
    private UserRoleDao userRoleDao;

    @Test
    public void insertById() {
        UserRole userRole = new UserRole();
        userRoleDao.insertById(2,0);
        System.out.println(userRole.getUserId());
    }
}