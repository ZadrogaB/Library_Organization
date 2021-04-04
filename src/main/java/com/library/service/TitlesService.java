package com.library.service;

import com.library.domain.Titles;
import com.library.repository.TitlesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TitlesService {
    private TitlesRepository repository;

    public Titles saveTitle(Titles title){
        return repository.save(title);
    }
}
