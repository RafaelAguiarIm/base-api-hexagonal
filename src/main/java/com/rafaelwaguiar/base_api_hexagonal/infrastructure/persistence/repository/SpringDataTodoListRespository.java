package com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.repository;

import com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.entity.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTodoListRespository extends JpaRepository<TodoListEntity, String> {

}
