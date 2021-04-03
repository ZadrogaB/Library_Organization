package com.library.domain;

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

    @Column(name = "Title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "YearOfPublish")
    private Year yearOfPublish;

    @OneToMany (
            targetEntity = Book.class,
            cascade =  CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "title"
    )
    private List<Book> listOfBooks;
}
