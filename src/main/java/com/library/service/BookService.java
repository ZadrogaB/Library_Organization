package com.library.service;

import com.library.domain.Book;
import java.util.Optional;
import com.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BookService {
    private BookRepository repository;

    public Book saveBook(Book book){
        return repository.save(book);
    }

    public Optional<Book> findById(Long id){
        return repository.findById(id);
    }

    public List<Book> findByTitle(String title){
        return repository.findAllByTitle(title);
    }
}
