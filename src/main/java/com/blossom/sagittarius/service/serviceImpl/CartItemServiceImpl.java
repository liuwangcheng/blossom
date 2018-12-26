package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.BookDao;
import com.blossom.sagittarius.dao.CartItemDao;
import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.domain.security.Book;
import com.blossom.sagittarius.domain.security.CartItem;
import com.blossom.sagittarius.domain.security.ShoppingCart;
import com.blossom.sagittarius.domain.security.User;
import com.blossom.sagittarius.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemDao cartItemDao;
    @Autowired
    private BookDao  bookDao;
    @Autowired
    private UserDao userDao;


    @Override
    public CartItem addBookToCartItem(Book book, User user, int qty) {
        Book book1 = bookDao.save(book);
        User user1 = userDao.saveUser(user);
        return cartItemDao.addBookToCartItem(book1,user1,qty);
    }

    @Override
    public List<CartItem> findByShoppingCartId(Integer shippingCartId) {
        List<CartItem> cartItemList = cartItemDao.findByShoppingCartId(shippingCartId);
        return cartItemList;
    }

    @Override
    public CartItem updateCartItem(CartItem cartItem) {

        return cartItemDao.updateCartItem(cartItem);
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    @Override
    public CartItem findById(Long id) {
        return cartItemDao.findById(id);
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemDao.save(cartItem);
    }
}
