package com.example.api_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_practice.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
