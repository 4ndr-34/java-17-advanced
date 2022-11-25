package com.ChungusBookProject.ChungusBookProject.repos;

import com.ChungusBookProject.ChungusBookProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository
        extends JpaRepository<Book, Long> {
}
