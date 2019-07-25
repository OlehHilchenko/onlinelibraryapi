package com.peterholub.onlinelibraryapi.entity;

import com.peterholub.onlinelibraryapi.model.BookModel;
import com.peterholub.onlinelibraryapi.model.FavoritesModel;
import com.peterholub.onlinelibraryapi.model.UserModel;
import lombok.Data;

@Data
public class FavoritesEntity implements FavoritesModel {
    private Long id;

    private UserModel user;

    private BookModel book;
}
