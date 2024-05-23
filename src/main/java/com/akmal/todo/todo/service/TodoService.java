package com.akmal.todo.todo.service;

import com.akmal.todo.todo.model.Todo;

import java.util.Optional;

public interface TodoService {
    public Optional<Todo> getById(Long id);

    public void save(Todo todo);

    public Iterable<Todo> getAll();
}
