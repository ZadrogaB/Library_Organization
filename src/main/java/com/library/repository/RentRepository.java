package com.library.repository;

import com.library.domain.Rent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RentRepository extends CrudRepository<Rent, Long> {
    @Override
    Rent save(final Rent rent);

    @Override
    Optional<Rent> findById(final Long id);
}
