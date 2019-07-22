package com.peterholub.onlinelibraryapi.repository;

import com.peterholub.onlinelibraryapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
