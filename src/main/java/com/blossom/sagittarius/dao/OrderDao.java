package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.*;

public interface OrderDao {

    Order createOrder(
            ShoppingCart shoppingCart,
            ShippingAddress shippingAddress,
            BillingAddress billingAddress,
            Payment payment,
            String shippingMethod,
            User user
    );

}
