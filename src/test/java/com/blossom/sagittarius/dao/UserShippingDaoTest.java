package com.blossom.sagittarius.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserShippingDaoTest {
    @Autowired
    private UserShippingDao userShippingDao;

    @Test
    public void findById() {
        System.out.println(userShippingDao.findById((long) 1));
    }

    @Test
    public void removeById() {
        userShippingDao.removeById((long) 1);
    }
}