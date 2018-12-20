package com.blossom.sagittarius.service;

import com.blossom.sagittarius.domain.security.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    List<Book> findAll();

    Book findOne(Long id);

    Book save(Book book);

    List<Book> blurrySearch(String title);

    void removeOne(Long id);

}
