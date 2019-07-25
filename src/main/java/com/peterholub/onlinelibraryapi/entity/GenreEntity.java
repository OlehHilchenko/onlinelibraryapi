package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.GenreModel;
import lombok.Data;

@Data
public class GenreEntity implements GenreModel {
    private Long id;

    private String name;
}
