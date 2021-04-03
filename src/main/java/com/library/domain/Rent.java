package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "Rents")
public class Rent {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "BookId")
    private Long bookId;

    @Column(name = "ReaderId")
    private Long readerId;

    @Column(name = "DateOfRent")
    private Date rentDate;

    @Column(name = "DateOfHandBack")
    private Date handBackDate;
}
