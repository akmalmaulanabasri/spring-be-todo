package com.akmal.todo.todo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainResource {

    @GetMapping("/")
    public List<String> index() {
        List<String> list = new ArrayList<String>();
        list.add("Welcome to my API");
        return list;
    }
}
