package com.library.mapper;

import com.library.domain.Book;
import com.library.domain.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookMapper {
    public BookDto mapToBookDto(final Book book){
        return new BookDto(book.getId(),
                book.getCondition(),
                book.getTitle());
    }

    public Book mapToBook(final BookDto bookDto){
        return new Book(bookDto.getId(),
                bookDto.getCondition(),
                bookDto.getTitle());
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList){
        return bookList.stream()
                .map(this::mapToBookDto)
                .collect(Collectors.toList());
    }
}
