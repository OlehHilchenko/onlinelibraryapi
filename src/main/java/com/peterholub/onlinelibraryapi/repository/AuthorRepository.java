package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {

}
