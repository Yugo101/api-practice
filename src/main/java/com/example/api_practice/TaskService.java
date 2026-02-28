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

    public Task update(Long id, Task updatedTask){
        Task task = repo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));

        task.setTitle(updatedTask.getTitle());
        task.setCompleted(updatedTask.isCompleted());

        return repo.save(task);

    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}
