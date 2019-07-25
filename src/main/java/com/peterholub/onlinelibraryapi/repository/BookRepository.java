package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {

}
