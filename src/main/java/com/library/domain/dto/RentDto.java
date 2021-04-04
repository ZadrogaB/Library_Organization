package com.library.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class RentDto {
    private Long id;
    private Long bookId;
    private Long readerId;
    private Date rentDate;
    private Date handBackDate;
}
