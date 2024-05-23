package com.akmal.todo.todo.repository;

import com.akmal.todo.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
