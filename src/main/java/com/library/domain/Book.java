package com.library.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Books")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "State")
    private String condition;


    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TitleId", referencedColumnName = "id")
    private Titles title;

//    public void setCondition(String condition) {
//        this.condition = condition;
//    }
}
