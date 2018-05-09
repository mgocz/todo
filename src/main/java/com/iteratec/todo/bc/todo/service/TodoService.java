package com.iteratec.todo.bc.todo.service;

import com.iteratec.todo.bc.todo.dao.TodoRepo;
import com.iteratec.todo.bc.todo.dao.entity.Todo;
import com.iteratec.todo.bc.todo.service.dto.TodoBasicDTO;
import com.iteratec.todo.bc.user.service.UserService;
import com.iteratec.todo.tech.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserService userService;

    public List<TodoBasicDTO> findAll() {
        return todoRepo.findAll().stream().map(TodoBasicDTO::new).collect(toList());
    }

    public List<TodoBasicDTO> findByUsername(String username) {
        return todoRepo.findByUsername(username).stream().map(TodoBasicDTO::new).collect(toList());
    }

    public TodoBasicDTO findById(Long id) {
        return new TodoBasicDTO(findTodoEntityById(id));
    }

    public TodoBasicDTO create(TodoBasicDTO dto, String username) {
        return new TodoBasicDTO(todoRepo.save(new Todo(dto, userService.findUserEntityByUsername(username))));
    }

    public TodoBasicDTO update(Long id, TodoBasicDTO dto, String username) {
        Todo todo = todoRepo.findByIdAndUsername(id, username).orElseThrow(() -> new ResourceNotFoundException("No TODO with id " + id + " found."));

        todo.setDate(dto.getDate());
        todo.setDescription(dto.getDescription());

        return new TodoBasicDTO(todoRepo.save(todo));
    }

    private Todo findTodoEntityById(Long id) {
        return todoRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("No TODO with id " + id + " found."));
    }

    public Long delete(Long id) {
        todoRepo.delete(findTodoEntityById(id));
        return id;
    }
}
