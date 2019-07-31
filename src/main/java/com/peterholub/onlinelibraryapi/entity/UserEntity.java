package com.peterholub.onlinelibraryapi.entity;

import java.util.Objects;
import java.util.Set;

import com.peterholub.onlinelibraryapi.model.FavoritesModel;
import com.peterholub.onlinelibraryapi.model.GroupModel;
import com.peterholub.onlinelibraryapi.model.UserModel;


public class UserEntity implements UserModel {
    private Long id;

    private String login;

    private String password;

    private GroupModel group;

    private Set<FavoritesModel> favorites;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public GroupModel getGroup() {
        return group;
    }

    public void setGroup(GroupModel group) {
        this.group = group;
    }

    @Override
    public Set<FavoritesModel> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<FavoritesModel> favorites) {
        this.favorites = favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(group, that.group) &&
                Objects.equals(favorites, that.favorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, group, favorites);
    }
}
