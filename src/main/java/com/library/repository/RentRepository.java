package com.library.repository;

import com.library.domain.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long> {
    @Override
    Rent save(Rent rent);
}
