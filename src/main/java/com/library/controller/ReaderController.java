package com.library.controller;

import com.library.domain.Reader;
import com.library.domain.dto.ReaderDto;
import com.library.mapper.ReaderMapper;
import com.library.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/library/reader")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderService service;
    private final ReaderMapper mapper;

    @PostMapping(value = "createReader")
    public void createReader(@RequestParam String name, String surname){
        Reader reader = new Reader();
        reader.setName(name);
        reader.setSurname(surname);
        reader.setAccountCreatedDate(new Date(System.currentTimeMillis()));
        service.saveReader(reader);
    }

}
