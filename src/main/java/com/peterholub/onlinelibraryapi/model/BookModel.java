package com.peterholub.onlinelibraryapi.model;

import java.net.URI;
import java.util.Set;

public interface BookModel {
    Long getId();

    String getName();

    String getDescription();

    Set<GenreModel> getGenres();

    Set<AuthorModel> getAuthors();

    URI getContent();

    URI getImage();
}
