package com.iteratec.todo.bc.user.dao.entity;

import com.iteratec.todo.bc.user.service.dto.CreateUserDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @Size(max = 100)
    private String username;

    @NotNull
    @Size(max = 200)
    private String password;

    @NotNull
    private String role;

    @NotNull
    private Boolean enabled;

    public User() {
    }

    public User(CreateUserDTO dto, String role) {
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.role = role;
        this.enabled = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
