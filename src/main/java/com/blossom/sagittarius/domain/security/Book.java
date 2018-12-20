package com.blossom.sagittarius.domain.security;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

public class Book {
    private Long Id;
    private String title;
    private String author;
    private String publisher;
    //private Timestamp publicationDate;
    private Date publicationDate;
    private String language;
    private String category;
    private int numberOfPages;
    private String format;
    private String ISBN;
    private double ShippingWeight;
    private BigDecimal ListPrice;
    private BigDecimal OurPrice;
    private String active;
    private String description;
    private int InStockNumber;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /*public Timestamp getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Timestamp publicationDate) {
        this.publicationDate = publicationDate;
    }*/

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getShippingWeight() {
        return ShippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        ShippingWeight = shippingWeight;
    }

    public BigDecimal getListPrice() {
        return ListPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        ListPrice = listPrice;
    }

    public BigDecimal getOurPrice() {
        return OurPrice;
    }

    public void setOurPrice(BigDecimal ourPrice) {
        OurPrice = ourPrice;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInStockNumber() {
        return InStockNumber;
    }

    public void setInStockNumber(int inStockNumber) {
        InStockNumber = inStockNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate=" + publicationDate +
                ", language='" + language + '\'' +
                ", category='" + category + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", format='" + format + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", ShippingWeight=" + ShippingWeight +
                ", ListPrice=" + ListPrice +
                ", OurPrice=" + OurPrice +
                ", active='" + active + '\'' +
                ", description='" + description + '\'' +
                ", InStockNumber=" + InStockNumber +
                '}';
    }


}
