package com.blossom.sagittarius.domain.security;

public class Cartitem {
    private Integer bookId;
    private Integer shippingCartId;
    private Integer Qty;
    private String Subtotal;
    private Integer orderId;

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

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer qty) {
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
        return "Cartitem{" +
                "bookId=" + bookId +
                ", shippingCartId=" + shippingCartId +
                ", Qty=" + Qty +
                ", Subtotal='" + Subtotal + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
