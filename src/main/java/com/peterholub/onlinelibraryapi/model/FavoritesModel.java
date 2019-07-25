package com.peterholub.onlinelibraryapi.model;

public interface FavoritesModel {
    Long getId();

    UserModel getUser();

    BookModel getBook();
}
