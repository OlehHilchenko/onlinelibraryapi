package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private long id;
    @Column
    private String name;
}