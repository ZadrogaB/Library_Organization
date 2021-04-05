package com.library.controller;

import com.library.domain.Rent;
import com.library.domain.dto.RentDto;
import com.library.domain.exception.BookNotExistException;
import com.library.domain.exception.RentNotExistException;
import com.library.mapper.RentMapper;
import com.library.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/library/rent")
@RequiredArgsConstructor
public class RentController {

    private final RentService service;
    private final RentMapper mapper;
    private final BookController bookController;

    @PostMapping(value = "rentBook")
    public RentDto rentBook(@RequestParam Long bookId, Long readerId) throws BookNotExistException {
        Rent newRent = new Rent();
        newRent.setBookId(bookId);
        newRent.setReaderId(readerId);
        newRent.setRentDate(new Date(System.currentTimeMillis()));
        bookController.changeStatus(bookId, "Rent");
        service.rentBook(newRent);
        return mapper.mapToRentDto(newRent);
    }

    @PutMapping("handBackBook")
    public RentDto handBackBook(@RequestParam Long rentId) throws RentNotExistException, BookNotExistException {
        Rent rent = service.findRentById(rentId);
        rent.setHandBackDate(new Date(System.currentTimeMillis()));
        bookController.changeStatus(rent.getBookId(), "Usable");
        service.rentBook(rent);
        return mapper.mapToRentDto(rent);
    }
}
