package com.peterholub.onlinelibraryapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group {
    @Id
    private Long id;

    private String groupName;
}
