package com.iteratec.todo.bc.todo.dao;

import com.iteratec.todo.bc.todo.dao.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

    @Query("SELECT T FROM Todo T WHERE T.user.username = :username")
    List<Todo> findByUsername(@Param("username") String username);

    @Query("SELECT T FROM Todo T WHERE T.id = :id AND T.user.username = :username")
    Optional<Todo> findByIdAndUsername(@Param("id") Long id, @Param("username") String username);
}
