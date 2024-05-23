package com.akmal.todo.todo.resource;

import com.akmal.todo.todo.model.Todo;
import com.akmal.todo.todo.service.TodoService;
import com.akmal.todo.utils.ResponseAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    @Autowired
    TodoService todoService;

    @GetMapping("/")
    public ResponseEntity<ResponseAPI<List<Todo>>> todo() {
        ResponseAPI response = new ResponseAPI<Todo>();
        List<Todo> todo = (List<Todo>) todoService.getAll();

        response.setStatus(true);
        response.setMessage("Suucess");
        response.setContent(todo);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/")
    public ResponseEntity<ResponseAPI<Todo>> save(@RequestBody Todo body){
        ResponseAPI response = new ResponseAPI<Todo>();

        todoService.save(body);
        response.setStatus(true);
        response.setMessage("Success");
        response.setContent(body);
        return ResponseEntity.ok(response);
    }
}
