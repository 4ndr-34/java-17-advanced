package com.ChungusBookProject.ChungusBookProject.controller;


import com.ChungusBookProject.ChungusBookProject.dto.BookDto;
import com.ChungusBookProject.ChungusBookProject.model.Book;
import com.ChungusBookProject.ChungusBookProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/greet1")
    public void greetings1() {
        System.out.println("Hello students!");
    }


    @PostMapping("/save")
    @ResponseBody
    public BookDto save(@RequestBody BookDto dto) {
        Book b = new Book();
        b.setBookName(dto.getBookName());
        b.setAuthor(dto.getAuthor());
        b.setYearOfPublish(dto.getYearOfPublish());
        b.setId(dto.getId());

        BookDto resp = new BookDto();
        resp.setBookName(b.getBookName());
        resp.setAuthor(b.getAuthor());
        resp.setYearOfPublish(b.getYearOfPublish());
        resp.setId(b.getId());

        return resp;

    }
}
