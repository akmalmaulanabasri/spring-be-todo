package com.akmal.todo.todo.service;

import com.akmal.todo.todo.model.Todo;
import com.akmal.todo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    TodoRepository todoRepository;

    @Override
    public Optional<Todo> getById(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo;
    }

    @Override
    public void save(Todo todo){
        todoRepository.save(todo);
    }

    @Override
    public Iterable<Todo> getAll() {
        return todoRepository.findAll();
    }
}
