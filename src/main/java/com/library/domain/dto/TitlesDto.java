package com.library.domain.dto;

import com.library.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Year;
import java.util.List;

@AllArgsConstructor
@Getter
public class TitlesDto {
    private Long id;
    private String title;
    private String author;
    private Year yearOfPublish;
    private List<Book> listOfBooks;
}
