package com.library.service;

import com.library.domain.Rent;
import com.library.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentService {
    private RentRepository repository;

    public Rent rentBook(Rent rent){
        return  repository.save(rent);
    }

    public Optional<Rent> findBookById (Long rentId){
        return repository.findById(rentId);
    }
}
