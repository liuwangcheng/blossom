package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);


}
