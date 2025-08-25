package com.rafaelwaguiar.base_api_hexagonal.infrastructure.persistence.entity;

import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class TodoListEntity {

    @Id
    private String id;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public TodoListEntity() {
    }

    public TodoListEntity(String id, String title, boolean completed, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoList todoList)) return false;
        return isCompleted() == todoList.isCompleted() && Objects.equals(getId(), todoList.getId()) && Objects.equals(getTitle(), todoList.getTitle()) && Objects.equals(getCreatedAt(), todoList.getCreatedAt()) && Objects.equals(getUpdatedAt(), todoList.getUpdatedAt()) && Objects.equals(getDeletedAt(), todoList.getDeletedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), isCompleted(), getCreatedAt(), getUpdatedAt(), getDeletedAt());
    }
}
