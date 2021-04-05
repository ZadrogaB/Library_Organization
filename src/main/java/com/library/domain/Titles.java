package com.library.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "Titles")
public class Titles {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "Title", unique = true, nullable = false)
    private String title;

    @Column(name = "Author", nullable = false)
    private String author;

    @Column(name = "YearOfPublish", nullable = false)
    private Long yearOfPublish;

    @JsonBackReference
    @OneToMany (
            targetEntity = Book.class,
            cascade =  CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "title"
    )
    private List<Book> listOfBooks;
}
