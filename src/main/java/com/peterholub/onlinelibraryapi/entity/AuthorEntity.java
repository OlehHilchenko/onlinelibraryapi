package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.AuthorModel;
import lombok.Data;

@Data
public class AuthorEntity implements AuthorModel {
    private Long id;
    private String authorName;

}
