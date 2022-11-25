package com.ChungusBookProject.ChungusBookProject.service.impl;

import com.ChungusBookProject.ChungusBookProject.exception.NotFoundException;
import com.ChungusBookProject.ChungusBookProject.model.Book;
import com.ChungusBookProject.ChungusBookProject.repos.BookRepository;
import com.ChungusBookProject.ChungusBookProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book b) {
        return bookRepository.save(b);
    }

    @Override
    public void removeBook(Book b) {
        bookRepository.delete(b);
    }

    @Override
    public void removeAll() {
        bookRepository.deleteAll();
    }

    @Override
    public Book findById(Long id) throws NotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(NotFoundException::new);
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
