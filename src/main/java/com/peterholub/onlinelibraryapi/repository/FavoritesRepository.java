package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.FavoritesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritesRepository extends JpaRepository<FavoritesModel, Long> {

}
