package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.Book;
import com.blossom.sagittarius.domain.security.CartItem;
import com.blossom.sagittarius.domain.security.ShoppingCart;
import com.blossom.sagittarius.domain.security.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CartItemDao {

    CartItem addBookToCartItem(Book book, User user, int qty);

    List<CartItem> findByShoppingCartId(Integer shippingCartId);

//	List<CartItem> findByOrder(Order order);

    CartItem updateCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    CartItem findById(Long id);

    CartItem save(CartItem cartItem);

}
