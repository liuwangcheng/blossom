package com.blossom.sagittarius.domain.security;

import java.math.BigDecimal;

public class ShoppingCart {
    private int Id;
    private Integer userId;
    private Integer cartItemId;
    private BigDecimal grandTotal;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", cartItemId=" + cartItemId +
                ", grandTotal='" + grandTotal + '\'' +
                '}';
    }
}
