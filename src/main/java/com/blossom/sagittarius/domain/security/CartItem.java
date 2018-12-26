package com.blossom.sagittarius.domain.security;

public class CartItem {
    private long Id;
    private Integer bookId;
    private Integer shippingCartId;
    private int Qty;
    private String Subtotal;
    private Integer orderId;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getShippingCartId() {
        return shippingCartId;
    }

    public void setShippingCartId(Integer shippingCartId) {
        this.shippingCartId = shippingCartId;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public String getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(String subtotal) {
        Subtotal = subtotal;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "Id=" + Id +
                ", bookId=" + bookId +
                ", shippingCartId=" + shippingCartId +
                ", Qty=" + Qty +
                ", Subtotal='" + Subtotal + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
