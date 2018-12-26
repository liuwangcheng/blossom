package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.*;

public interface OrderService {
    Order createOrder(
            ShoppingCart shoppingCart,
            ShippingAddress shippingAddress,
            BillingAddress billingAddress,
            Payment payment,
            String shippingMethod,
            User user
    );

}
