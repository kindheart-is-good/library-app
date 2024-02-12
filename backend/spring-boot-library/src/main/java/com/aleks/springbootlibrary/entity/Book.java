package com.aleks.springbootlibrary.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "book") // this is the name of the table within MySQL database.
@Data // data for Lombok, which is going to dynamically create all the getters and setters for book.
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // strategy equals generation type identity
    @Column(name = "id")    // need to name the column of the table in MySQL
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "copies")
    private int copies;

    @Column(name = "copies_available")
    private int copiesAvailable;

    @Column(name = "category")
    private String category;

    @Column(name = "img")
    private String img;
}
