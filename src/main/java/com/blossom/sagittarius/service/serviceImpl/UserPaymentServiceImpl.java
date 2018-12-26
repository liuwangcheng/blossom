package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.UserPaymentDao;
import com.blossom.sagittarius.domain.security.UserPayment;
import com.blossom.sagittarius.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserPaymentServiceImpl implements UserPaymentService {
    @Autowired
    private UserPaymentDao userPaymentDao;

    @Override
    public UserPayment findById(Long id) {
        return userPaymentDao.findById(id);
    }

    @Override
    public void removeById(Long id) {
        userPaymentDao.removeById(id);
    }
}
