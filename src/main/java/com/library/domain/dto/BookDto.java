package com.library.domain.dto;

import com.library.domain.Titles;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookDto {
    private Long id;
    private String condition;
    private Titles title;
}
