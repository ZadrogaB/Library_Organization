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

    private final BookRepository repository;

    public Book saveBook(final Book book){
        return repository.save(book);
    }

    public Optional<Book> findById(final Long id){
        return repository.findById(id);
    }

    public List<Book> findAllById(final Long id){
        return repository.findAllById(id);
    }
}
