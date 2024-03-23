package com.example.demo.service;

import com.example.demo.model.TodoList;
import com.example.demo.repo.TodoListRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TodoListService {

    private final TodoListRepo todoListRepo;



    public TodoList save(TodoList todoList) {
        return todoListRepo.save(todoList);
    }

    public List<TodoList> findAll() {
        return todoListRepo.findAll();
    }
}
