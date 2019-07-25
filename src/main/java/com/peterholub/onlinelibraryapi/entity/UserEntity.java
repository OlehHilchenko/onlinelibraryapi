package com.peterholub.onlinelibraryapi.entity;

import java.util.Set;

import com.peterholub.onlinelibraryapi.model.FavoritesModel;
import com.peterholub.onlinelibraryapi.model.GroupModel;
import com.peterholub.onlinelibraryapi.model.UserModel;
import lombok.Data;


@Data
public class UserEntity implements UserModel {
    private Long id;

    private String login;

    private String password;

    private GroupModel group;

    private Set<FavoritesModel> favorites;

}
