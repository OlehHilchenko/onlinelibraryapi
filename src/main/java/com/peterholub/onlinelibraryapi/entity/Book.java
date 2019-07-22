package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="book")
public class Book {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Genre> genre;
    @Column
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Author> author;

    private byte[] content;
    private byte[] image;
}
