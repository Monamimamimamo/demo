package com.example.demo.repo;

import com.example.demo.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepo extends JpaRepository<TodoList, Long> {
}