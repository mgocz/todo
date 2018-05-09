package com.iteratec.todo.bc.todo.service.dto;

import com.iteratec.todo.bc.todo.dao.entity.Todo;

import java.time.LocalDateTime;

public class TodoBasicDTO {
    private Long id;
    private LocalDateTime date;
    private String description;

    public TodoBasicDTO() {
    }

    public TodoBasicDTO(Todo todo) {
        this.id = todo.getId();
        this.date = todo.getDate();
        this.description = todo.getDescription();
    }

    public TodoBasicDTO(LocalDateTime date, String description) {
        this.date = date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
