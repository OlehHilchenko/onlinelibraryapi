package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.AuthorModel;
import com.peterholub.onlinelibraryapi.model.BookModel;
import com.peterholub.onlinelibraryapi.model.GenreModel;

import java.net.URI;
import java.util.Objects;
import java.util.Set;

public class BookEntity implements BookModel {

    private Long id;

    private String name;

    private String description;

    private Set<GenreModel> genres;

    private Set<AuthorModel> authors;

    private URI content;

    private URI image;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Set<GenreModel> getGenres() {
        return genres;
    }

    public void setGenres(Set<GenreModel> genres) {
        this.genres = genres;
    }

    @Override
    public Set<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorModel> authors) {
        this.authors = authors;
    }

    @Override
    public URI getContent() {
        return content;
    }

    public void setContent(URI content) {
        this.content = content;
    }

    @Override
    public URI getImage() {
        return image;
    }

    public void setImage(URI image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(genres, that.genres) &&
                Objects.equals(authors, that.authors) &&
                Objects.equals(content, that.content) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, genres, authors, content, image);
    }
}
