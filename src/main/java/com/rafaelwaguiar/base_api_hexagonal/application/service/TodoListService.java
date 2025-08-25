package com.rafaelwaguiar.base_api_hexagonal.application.service;

import com.rafaelwaguiar.base_api_hexagonal.api.exception.TodoListNotFoundException;
import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;
import com.rafaelwaguiar.base_api_hexagonal.domain.port.in.TodoListUseCase;
import com.rafaelwaguiar.base_api_hexagonal.domain.port.out.TodoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoListService implements TodoListUseCase {

    private final TodoListRepository repository;

    public TodoListService(TodoListRepository repository) {
        this.repository = repository;
    }
    @Override
    public TodoList createTodoList(String title) {
        TodoList createdTodoList = new TodoList(UUID.randomUUID().toString(), title);
        return repository.save(createdTodoList);
    }

    @Override
    public List<TodoList> getAllTodoLists() {
        return repository.findAll();
    }

    @Override
    public TodoList getTodoListById(String id) {
        return repository.findById(id).orElseThrow( () -> new RuntimeException("TodoList not found with id: " + id));
    }

    @Override
    public TodoList updateTodoList(String id, TodoList todoList) {
        return null;
    }

    @Override
    public void deleteTodoList(String id) {
        repository.deleteById(id);
    }

    @Override
    public TodoList completeTodoList(String id) {
        TodoList todoList = repository.findById(id).orElseThrow( () -> new RuntimeException("TodoList not found with id: " + id));
        todoList.markAsCompleted();
        return repository.save(todoList);
    }

}
