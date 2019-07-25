package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupModel, Long> {
}
