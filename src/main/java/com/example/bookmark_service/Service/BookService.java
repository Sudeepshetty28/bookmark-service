
package com.example.bookmark_service.Service;
import com.example.bookmark_service.entity.BookEntity;
import com.example.bookmark_service.Repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    // POST - Save bookmark
    public BookEntity saveBook(BookEntity book) {
        return bookRepo.save(book);
    }

    // GET - Get all bookmarks
    public List<BookEntity> getAllBooks() {
        return bookRepo.findAll();
    }
}