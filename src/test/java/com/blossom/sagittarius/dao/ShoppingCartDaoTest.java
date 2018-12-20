package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.ShoppingCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartDaoTest {
    @Autowired
    private ShoppingCartDao shoppingCartDao;

    @Test
    public void updateShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUserId(4);
        shoppingCart.setCartItemId(2);
        shoppingCart.setGrandTotal(new BigDecimal(34));
        shoppingCart.setId(1);
        shoppingCartDao.updateShoppingCart(shoppingCart);
    }

    @Test
    public void clearShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCartDao.clearShoppingCart(shoppingCart);
    }
}