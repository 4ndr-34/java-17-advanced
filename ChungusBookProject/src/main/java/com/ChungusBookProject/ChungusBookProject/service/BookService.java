package com.ChungusBookProject.ChungusBookProject.service;

import com.ChungusBookProject.ChungusBookProject.exception.NotFoundException;
import com.ChungusBookProject.ChungusBookProject.model.Book;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface BookService {

    Book saveBook(Book b);

    void removeBook(Book b);

    void removeAll();

    Book findById(Long id) throws NotFoundException;

    List<Book> getAllBooks();
}
