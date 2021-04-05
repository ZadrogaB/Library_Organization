package com.library.service;

import com.library.domain.Titles;
import com.library.repository.TitlesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TitlesService {
    private final TitlesRepository repository;

    public Titles saveTitle(final Titles title){
        return repository.save(title);
    }

    public Optional<Titles> findById(final Long id){
        return repository.findById(id);
    }

    public Titles findByTitle(final String title){
        return repository.findByTitle(title);
    }
}
