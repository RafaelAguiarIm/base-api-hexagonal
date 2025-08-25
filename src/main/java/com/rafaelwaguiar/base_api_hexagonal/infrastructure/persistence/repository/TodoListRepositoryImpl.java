package com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.repository;

import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;
import com.rafaelwaguiar.base_api_hexagonal.domain.port.out.TodoListRepository;
import com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.mapper.TodoListMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TodoListRepositoryImpl implements TodoListRepository {

    private final SpringDataTodoListRespository repository;

    public TodoListRepositoryImpl(SpringDataTodoListRespository repository) {
        this.repository = repository;
    }

    @Override
    public TodoList save(TodoList todoList) {
        return TodoListMapper.toDomain(
                repository.save(
                        TodoListMapper.toEntity(todoList)
                )
        );
    }

    @Override
    public Optional<TodoList> findById(String id) {
        return repository.findById(id)
                .map(TodoListMapper::toDomain);
    }

    @Override
    public List<TodoList> findAll() {
        return repository.findAll()
                .stream()
                .map(TodoListMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
