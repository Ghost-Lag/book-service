package ru.gostlag.book_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gostlag.book_service.service.ExampleService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/example")
public class ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/create")
    public String createExample(){
        exampleService.saveExampleEntity();
        return "example entity created";
    }

    @GetMapping
    public String getBookName(){

        return exampleService.getBookName();
    }
}
