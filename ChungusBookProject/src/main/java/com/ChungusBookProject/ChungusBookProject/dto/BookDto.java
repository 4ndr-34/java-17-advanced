package com.ChungusBookProject.ChungusBookProject.dto;

import lombok.Data;

@Data
public class BookDto {

    private Long id;
    private String bookName;
    private String author;
    private String yearOfPublish;
}
