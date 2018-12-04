package com.blossom.sagittarius.domain.security;

import com.blossom.sagittarius.domain.BaseDO;

public class User extends BaseDO {

    private Integer Id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String Email;
    private Integer Phone;
    private String Enabled;
    private String userRoles;
    private Integer creditcardId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getEnabled() {
        return Enabled;
    }

    public void setEnabled(String enabled) {
        Enabled = enabled;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    public Integer getCreditcardId() {
        return creditcardId;
    }

    public void setCreditcardId(Integer creditcardId) {
        this.creditcardId = creditcardId;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone=" + Phone +
                ", Enabled='" + Enabled + '\'' +
                ", userRoles='" + userRoles + '\'' +
                ", creditcardId=" + creditcardId +
                '}';
    }
}
