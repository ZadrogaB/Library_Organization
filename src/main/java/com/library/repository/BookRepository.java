package com.library.repository;

import com.library.domain.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface BookRepository extends CrudRepository<Book, Long> {
    @Override
    Book save(final Book book);

    @Override
    Optional<Book> findById(final Long id);

    List<Book> findAllById(final Long id);
}
