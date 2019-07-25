package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
