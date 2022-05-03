package com.example.springTodoLesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springTodoLesson.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
		
}
