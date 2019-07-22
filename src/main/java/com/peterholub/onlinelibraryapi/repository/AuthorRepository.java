package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {

}
