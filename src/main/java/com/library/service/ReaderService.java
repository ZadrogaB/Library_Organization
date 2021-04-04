package com.library.service;

import com.library.domain.Reader;
import com.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReaderService {
    private ReaderRepository repository;

    public Reader saveReader(Reader reader){
        return repository.save(reader);
    }
}
