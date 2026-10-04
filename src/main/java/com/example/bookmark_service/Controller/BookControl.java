package com.example.bookmark_service.Controller;

import com.example.bookmark_service.entity.BookEntity;
import com.example.bookmark_service.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/bookmarks")
public class BookControl {

    @Autowired
    BookService Service;

    @PostMapping("")
    public ResponseEntity<BookEntity> addBook(@Valid @RequestBody BookEntity book) {
        BookEntity savedBook = Service.saveBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("")
    public List<BookEntity> getAllBooks() {
        return Service.getAllBooks();
    }
}