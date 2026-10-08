package jwtauth.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwtauth.jwt.entity.TodoList;

@Repository
public interface TodoRepository extends JpaRepository<TodoList, Long> {

}
