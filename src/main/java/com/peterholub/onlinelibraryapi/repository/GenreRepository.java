package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.GenreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreModel, Long> {
}
