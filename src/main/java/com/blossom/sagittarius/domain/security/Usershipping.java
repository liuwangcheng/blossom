package com.blossom.sagittarius.domain.security;

public class Usershipping {

    private Integer Id;
    private String Street;
    private String City;
    private String Country;
    private Integer zipCode;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Usershipping{" +
                "Id=" + Id +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
