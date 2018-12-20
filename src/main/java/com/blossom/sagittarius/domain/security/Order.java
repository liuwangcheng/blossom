package com.blossom.sagittarius.domain.security;

import java.util.Date;

public class Order {
    private Integer Id;
    private Date orderDate;
    private Date shippingDate;
    private String orderStatus;
    private Integer orderDetailsId;
    private Integer shippingCartId;
    private Integer ShippingAddressId;
    private Integer billingAddressId;
    private String Total;
    private Integer PaymentId;
    private Integer CartItemId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Integer orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public Integer getShippingCartId() {
        return shippingCartId;
    }

    public void setShippingCartId(Integer shippingCartId) {
        this.shippingCartId = shippingCartId;
    }

    public Integer getShippingAddressId() {
        return ShippingAddressId;
    }

    public void setShippingAddressId(Integer shippingAddressId) {
        ShippingAddressId = shippingAddressId;
    }

    public Integer getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Integer billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public Integer getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(Integer paymentId) {
        PaymentId = paymentId;
    }

    public Integer getCartItemId() {
        return CartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        CartItemId = cartItemId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", orderDate=" + orderDate +
                ", shippingDate=" + shippingDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDetailsId=" + orderDetailsId +
                ", shippingCartId=" + shippingCartId +
                ", ShippingAddressId=" + ShippingAddressId +
                ", billingAddressId=" + billingAddressId +
                ", Total='" + Total + '\'' +
                ", PaymentId=" + PaymentId +
                ", CartItemId=" + CartItemId +
                '}';
    }
}
