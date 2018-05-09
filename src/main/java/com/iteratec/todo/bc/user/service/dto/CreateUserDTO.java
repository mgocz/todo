package com.iteratec.todo.bc.user.service.dto;

import com.iteratec.todo.tech.exception.BadRequestException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDTO {

    private String username;
    private String password;

    public void validate() {
        if (username == null || username.length() == 0) {
            throw new BadRequestException("Username is required.");
        }
        if (password == null || password.length() == 0) {
            throw new BadRequestException("Password is required.");
        }
    }
}
