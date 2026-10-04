package ru.gostlag.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gostlag.book_service.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
