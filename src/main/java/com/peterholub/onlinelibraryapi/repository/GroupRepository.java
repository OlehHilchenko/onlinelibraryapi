package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
