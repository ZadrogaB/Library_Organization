package com.library.repository;

import com.library.domain.Book;
import com.library.domain.Titles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TitlesRepository extends CrudRepository<Titles, Long> {
    @Override
    Titles save(final Titles title);

    @Override
    Optional<Titles> findById(final Long id);

    Titles findByTitle(final String title);
}
