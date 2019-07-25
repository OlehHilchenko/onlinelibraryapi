package com.peterholub.onlinelibraryapi.model;

import java.util.Set;

public interface GroupModel {
    Long getId();

    String getGroupName();

    Set<UserModel> getUsers();
}
