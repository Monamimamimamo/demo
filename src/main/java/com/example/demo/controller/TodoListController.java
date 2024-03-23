package com.example.demo.controller;

import com.example.demo.model.TodoList;
import com.example.demo.service.TodoListService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/todolists")
public class TodoListController {

    private final TodoListService todoListService;


    @PostMapping
    public TodoList saveTodoList(@RequestBody TodoList todoList) {
        return todoListService.save(todoList);
    }

    @GetMapping
    public List<TodoList> getAllTodoLists() {
        return todoListService.findAll();
    }
}
