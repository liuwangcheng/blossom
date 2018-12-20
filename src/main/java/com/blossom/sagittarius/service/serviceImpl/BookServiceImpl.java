package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.BookDao;
import com.blossom.sagittarius.domain.security.Book;
import com.blossom.sagittarius.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        List<Book> bookList = bookDao.findAll();
        return bookList;
    }

    @Override
    public Book findOne(Long id) {
        Book book = bookDao.findOne(id);
        return book;
    }

    @Override
    public Book save(Book book) {
        Book book1 =bookDao.save(book);
        return book1;
    }

    @Override
    public List<Book> blurrySearch(String title) {
        List<Book> bookList = bookDao.blurrySearch(title);
        return bookList;
    }

    @Override
    public void removeOne(Long id) {
         bookDao.removeOne(id);
    }
}
