package com.library.service;

import com.library.domain.Reader;
import com.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReaderService {
    private final ReaderRepository repository;

    public Reader saveReader(final Reader reader){
        return repository.save(reader);
    }
}
