package com.peterholub.onlinelibraryapi.model;

import java.util.Set;

public interface UserModel {
    Long getId();

    String getLogin();

    String getPassword();

    GroupModel getGroup();

    Set<FavoritesModel> getFavorites();
}
