package com.peterholub.onlinelibraryapi.entity;

import java.util.Set;

import com.peterholub.onlinelibraryapi.model.GroupModel;
import com.peterholub.onlinelibraryapi.model.UserModel;
import lombok.Data;


@Data
public class GroupEntity implements GroupModel {
    private Long id;

    private String groupName;

    private Set<UserModel> users;
}
