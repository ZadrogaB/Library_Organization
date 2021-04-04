package com.library.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ReaderDto {
    private Long id;
    private String name;
    private String surname;
    private Date accountCreatedDate;
}
