package com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.mapper;

import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;
import com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.entity.TodoListEntity;

public class TodoListMapper {

    public static TodoList toDomain(TodoListEntity entity) {
        TodoList todoList = new TodoList(entity.getId(), entity.getTitle());
        if (entity.isCompleted()) todoList.markAsCompleted();
        return todoList;
    }

    public static TodoListEntity toEntity(TodoList todoList) {
        if (todoList == null) {
            return null;
        }
        TodoListEntity entity = new TodoListEntity();
        entity.setId(todoList.getId());
        entity.setTitle(todoList.getTitle());
        entity.setCompleted(todoList.isCompleted());
        entity.setCreatedAt(todoList.getCreatedAt());

        return entity;
    }
}
