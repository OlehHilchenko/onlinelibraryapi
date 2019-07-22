package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
