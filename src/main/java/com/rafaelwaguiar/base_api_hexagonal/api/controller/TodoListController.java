package com.rafaelwaguiar.base_api_hexagonal.api.controller;

import com.rafaelwaguiar.base_api_hexagonal.api.dto.TodoListDTO;
import com.rafaelwaguiar.base_api_hexagonal.application.service.TodoListService;
import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/todos")
public class TodoListController {

    private final TodoListService service;

    public TodoListController(TodoListService service) {
        this.service = service;
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the Todo List API!";
    }

    @PostMapping
    public TodoListDTO create(@RequestBody TodoListDTO dto) {
        TodoList todo = service.createTodoList(dto.title());
        return toDTO(todo);
    }

    @GetMapping
    public List<TodoListDTO> getAll() {
        return service.getAllTodoLists().stream().map(this::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TodoListDTO getById(@PathVariable String id) {
        return toDTO(service.getTodoListById(id));
    }

    @PutMapping("/{id}/complete")
    public TodoListDTO complete(@PathVariable String id) {
        return toDTO(service.completeTodoList(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteTodoList(id);
    }

    private TodoListDTO toDTO(TodoList todo) {
        TodoListDTO dto = new TodoListDTO(todo.getId(), todo.getTitle(), todo.isCompleted());
        return dto;
    }
}

