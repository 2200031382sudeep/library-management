package com.example.library_management;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();  // works because of JpaRepository
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
