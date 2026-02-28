package com.example.api_practice;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo){
        this.repo = repo;
    }

    public Task save(Task task){
        return repo.save(task);
    }

    public List<Task> findAll(){
        return repo.findAll();
    }
}
