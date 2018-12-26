package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.UserShipping;

public interface UserShippingService {

    UserShipping findById(Long id);

    void removeById(Long id);
}
