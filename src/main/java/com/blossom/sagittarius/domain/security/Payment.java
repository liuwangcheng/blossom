package com.blossom.sagittarius.domain.security;

import java.util.Date;

public class Payment {
    private Integer Id;
    private String cardNumber;
    private Date expiringDate;
    private String CVC;
    private String holderName;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }

    public String getCVC() {
        return CVC;
    }

    public void setCVC(String CVC) {
        this.CVC = CVC;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Id=" + Id +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiringDate=" + expiringDate +
                ", CVC='" + CVC + '\'' +
                ", holderName='" + holderName + '\'' +
                '}';
    }
}
