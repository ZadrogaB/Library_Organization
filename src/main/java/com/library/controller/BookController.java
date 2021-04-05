package com.library.controller;

import com.library.domain.Book;
import com.library.domain.Titles;
import com.library.domain.dto.BookDto;
import com.library.domain.exception.BookNotExistException;
import com.library.domain.exception.TitleNotFoundException;
import com.library.mapper.BookMapper;
import com.library.service.BookService;
import com.library.service.TitlesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/library/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;
    private final TitlesService titleService;
    private final BookMapper mapper;

    @PostMapping(value = "createBook")
    public void createBook(@RequestParam String condition, Long titleId) throws TitleNotFoundException {
        Book newBook = new Book();
        newBook.setCondition(condition);
        newBook.setTitle(titleService.findById(titleId).orElseThrow(TitleNotFoundException::new));
        service.saveBook(newBook);
    }

    @PutMapping(value = "changeStatus")
    public BookDto changeStatus(@RequestParam Long bookId, String condition) throws BookNotExistException {
        Book book = service.findById(bookId).orElseThrow(BookNotExistException::new);
        book.setCondition(condition);
        return mapper.mapToBookDto(service.saveBook(book));
    }

    @GetMapping(value = "numberOfBooks")
    public Integer numberOfBooks(@RequestParam String title){
        Titles titlesForId = titleService.findByTitle(title);
        System.out.println(titlesForId);
        List<Book> bookList = service.findAllById(titlesForId.getId());
        System.out.println(bookList);
        System.out.println(bookList.size());
        return bookList.size();
    }
}
