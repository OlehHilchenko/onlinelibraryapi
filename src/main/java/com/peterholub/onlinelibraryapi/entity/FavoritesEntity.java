package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.BookModel;
import com.peterholub.onlinelibraryapi.model.FavoritesModel;
import com.peterholub.onlinelibraryapi.model.UserModel;

import java.util.Objects;

public class FavoritesEntity implements FavoritesModel {
    private Long id;

    private UserModel user;

    private BookModel book;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoritesEntity that = (FavoritesEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, book);
    }
}
