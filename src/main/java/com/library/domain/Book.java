package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "Books")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "State")
    private BookCondition condition;


    @ManyToOne
    @JoinColumn(name = "TitleId", referencedColumnName = "id")
    private Titles title;


}
