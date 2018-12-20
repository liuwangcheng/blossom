package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void findAll() {
        List<Book>  bookList = bookDao.findAll();
        for(Book book : bookList){
            System.out.println(book);
        }
    }

    @Test
    public void findOne() {
        Book book = bookDao.findOne((long) 1);
        System.out.println(book);
    }

    @Test
    public void save() {
        Book book = new Book();
        book.setTitle("Java");
        book.setAuthor("hello");
        book.setPublisher("新华书店");
        //book.setPublicationDate(new Timestamp(System.currentTimeMillis());
        book.setLanguage("中文");
        book.setCategory("教育");
        book.setNumberOfPages(120);
        book.setFormat("xxxx");
        book.setISBN("00-00-001");
        book.setShippingWeight(100);
        book.setListPrice(new BigDecimal(3.2));
        book.setOurPrice(new BigDecimal(1.2));
        book.setActive("双12");
        book.setDescription("好看的书");
        book.setInStockNumber(5246879);
        bookDao.save(book);
    }

    @Test
    public void blurrySearch() {
        List<Book> bookList = bookDao.blurrySearch("Java");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    public void removeOne() {
        bookDao.removeOne((long) 1);
    }
}