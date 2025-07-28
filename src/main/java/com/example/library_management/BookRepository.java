package com.example.library_management;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // no need to declare findAll() — it's already in JpaRepository
}
