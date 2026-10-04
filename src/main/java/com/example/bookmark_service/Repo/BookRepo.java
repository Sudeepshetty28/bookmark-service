package com.example.bookmark_service.Repo;

import com.example.bookmark_service.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity, Long> {
}