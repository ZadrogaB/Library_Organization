package com.library.repository;

import com.library.domain.Titles;
import org.springframework.data.repository.CrudRepository;

public interface TitlesRepository extends CrudRepository<Titles, Long> {
    @Override
    Titles save(Titles title);


}
