package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Users {
    @Id
    private Long id;
    private String userId;
    private String password;
    private String group_id;
}
