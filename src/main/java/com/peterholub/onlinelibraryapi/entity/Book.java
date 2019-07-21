package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String genre;
    @Column
    private String author;

    private byte[] content;
    private byte[] image;
}
