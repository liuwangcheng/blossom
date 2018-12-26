package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.UserShippingDao;
import com.blossom.sagittarius.domain.security.UserShipping;
import com.blossom.sagittarius.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserShippingServiceImpl implements UserShippingService {
    @Autowired
    private UserShippingDao userShippingDao;

    @Override
    public UserShipping findById(Long id) {
        return userShippingDao.findById(id);
    }

    @Override
    public void removeById(Long id) {
        userShippingDao.removeById(id);
    }
}
