package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="favorites")
public class Favorites {
    @Id
    private Long id;
    @Column
    private String userId;
    @Column
    private int bookId;


}
