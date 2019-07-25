package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.AuthorModel;
import com.peterholub.onlinelibraryapi.model.BookModel;
import com.peterholub.onlinelibraryapi.model.GenreModel;
import lombok.Data;

import java.net.URI;
import java.util.Set;

@Data
public class BookEntity implements BookModel {

    private Long id;

    private String name;

    private String description;

    private Set<GenreModel> genres;

    private Set<AuthorModel> authors;

    private URI content;

    private URI image;
}
