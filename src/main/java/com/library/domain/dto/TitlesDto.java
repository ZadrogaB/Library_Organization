package com.library.domain.dto;

import com.library.domain.Book;
import java.time.Year;
import java.util.List;

public class TitlesDto {
    private Long id;
    private String title;
    private String author;
    private Year yearOfPublish;
    private List<Book> listOfBooks;
}
