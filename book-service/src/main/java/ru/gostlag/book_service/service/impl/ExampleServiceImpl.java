package ru.gostlag.book_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gostlag.book_service.model.Book;
import ru.gostlag.book_service.repository.BookRepository;
import ru.gostlag.book_service.service.ExampleService;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final BookRepository bookRepository;

    @Override
    public void saveExampleEntity(){
        Book book= Book.builder()
                .bookName("example book name")
                .autorName("example autor name")
                .build();

        bookRepository.save(book);
    }

    @Override
    public String getBookName(){

        return bookRepository.findAll().get(0).getBookName();
    }
}
