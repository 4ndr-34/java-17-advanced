package com.ChungusBookProject.ChungusBookProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Entity
@ToString
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private String yearOfPublish;

    public Book(String bookName, String author, String yearOfPublish) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public Book() {

    }
}
