package com.example.demo.Repository;

import com.example.demo.Model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoTask, Long> {
}
