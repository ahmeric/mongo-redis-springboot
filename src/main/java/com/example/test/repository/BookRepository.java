package com.example.test.repository;

import com.example.test.document.Book;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

  Optional<Book> findBookByTitle(String titleName);
}
