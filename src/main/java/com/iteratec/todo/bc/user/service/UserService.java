package com.iteratec.todo.bc.user.service;

import com.iteratec.todo.bc.user.dao.UserRepo;
import com.iteratec.todo.bc.user.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserDTO> findAll() {
        return userRepo.findAll().stream().map(UserDTO::new).collect(toList());
    }

    public UserDTO findById(Long id) {
        return userRepo.findById(id).map(UserDTO::new).orElse(null);
    }
}
