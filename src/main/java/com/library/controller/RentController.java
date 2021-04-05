package com.library.controller;

import com.library.domain.Rent;
import com.library.domain.dto.RentDto;
import com.library.domain.exception.RentNotExistException;
import com.library.mapper.RentMapper;
import com.library.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/library/rent")
@RequiredArgsConstructor
public class RentController {

    private final RentService service;
    private final RentMapper mapper;

    @PostMapping(value = "rentBook")
    public RentDto rentBook(@RequestParam Long bookId, Long readerId){
        Rent newRent = new Rent();
        newRent.setBookId(bookId);
        newRent.setReaderId(readerId);
        newRent.setRentDate(new Date(System.currentTimeMillis()));
        service.rentBook(newRent);
        return mapper.mapToRentDto(newRent);
    }

    @PutMapping("handBackBook")
    public RentDto handBackBook(@RequestParam Long rentId) throws RentNotExistException {
        Rent rent = service.findBookById(rentId);
        rent.setHandBackDate(new Date(System.currentTimeMillis()));
        service.rentBook(rent);
        return mapper.mapToRentDto(rent);
    }
}
