package com.blossom.sagittarius.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPaymentDaoTest {
    @Autowired
    private UserPaymentDao userPaymentDao;

    @Test
    public void findById() {
        System.out.println(userPaymentDao.findById((long) 1));
    }

    @Test
    public void removeById() {
        userPaymentDao.removeById((long) 1);
    }
}