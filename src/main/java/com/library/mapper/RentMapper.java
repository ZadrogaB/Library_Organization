package com.library.mapper;

import com.library.domain.Rent;
import com.library.domain.dto.RentDto;
import org.springframework.stereotype.Service;

@Service
public class RentMapper {

    public Rent mapToRent(final RentDto rentDto){
        return new Rent(rentDto.getId(),
                rentDto.getBookId(),
                rentDto.getReaderId(),
                rentDto.getRentDate(),
                rentDto.getHandBackDate());
    }

    public RentDto mapToRentDto(final Rent rent){
        return new RentDto(rent.getId(),
                rent.getBookId(),
                rent.getReaderId(),
                rent.getRentDate(),
                rent.getHandBackDate());
    }
}
