package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="genre")
public class Genre {
    @Id
    private Long id;
    @Column
    private String name;
}
