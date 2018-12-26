package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.domain.security.*;
import com.blossom.sagittarius.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {



    @Override
    public Order createOrder(
            ShoppingCart shoppingCart,
            ShippingAddress shippingAddress,
            BillingAddress billingAddress,
            Payment payment,
            String shippingMethod,
            User user) {

        return null;
    }
}
