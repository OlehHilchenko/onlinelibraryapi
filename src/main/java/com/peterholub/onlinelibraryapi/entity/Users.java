package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private long id;
    private String userId;
    private String password;
    private String group_id;
}
