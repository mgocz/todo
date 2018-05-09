package com.iteratec.todo.bc.user.rest;

import com.iteratec.todo.bc.user.service.UserService;
import com.iteratec.todo.bc.user.service.dto.CreateUserDTO;
import com.iteratec.todo.bc.user.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rest/user")
public class UserRest {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<UserDTO> findAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public UserDTO findUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(path = "/create", method = RequestMethod.PUT)
    public UserDTO create(@RequestBody CreateUserDTO dto) {
        return userService.create(dto);
    }
}
