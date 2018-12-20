package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.ShoppingCartDao;
import com.blossom.sagittarius.domain.security.ShoppingCart;
import com.blossom.sagittarius.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartDao shoppingCartDao;


    @Override
    public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartDao.updateShoppingCart(shoppingCart);
    }

    @Override
    public void clearShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartDao.clearShoppingCart(shoppingCart);
    }
}
