package com.peterholub.onlinelibraryapi.entity;

import java.util.Objects;
import java.util.Set;

import com.peterholub.onlinelibraryapi.model.GroupModel;
import com.peterholub.onlinelibraryapi.model.UserModel;


public class GroupEntity implements GroupModel {
    private Long id;

    private String groupName;

    private Set<UserModel> users;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public Set<UserModel> getUsers() {
        return users;
    }

    public void setUsers(Set<UserModel> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupEntity that = (GroupEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, users);
    }
}
