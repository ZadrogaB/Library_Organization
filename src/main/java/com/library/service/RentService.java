package com.library.service;

import com.library.domain.Rent;
import com.library.domain.exception.RentNotExistException;
import com.library.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentService {
    private final RentRepository repository;

    public Rent rentBook(final Rent rent){
        return  repository.save(rent);
    }

    public Rent findBookById (final Long rentId) throws RentNotExistException {
        return repository.findById(rentId).orElseThrow(RentNotExistException::new);
    }
}
