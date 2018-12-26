package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.UserPayment;

public interface UserPaymentService {

    UserPayment findById(Long id);

    void removeById(Long id);
}
