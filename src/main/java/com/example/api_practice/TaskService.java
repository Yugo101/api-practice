package com.example.api_practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.api_practice.dto.TaskRequest;
import com.example.api_practice.dto.TaskResponse;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private static final Logger log = LoggerFactory.getLogger(TaskService.class);
    private TaskResponse mapToResponse(Task task){
        return new TaskResponse(
                task.getId(),
                task.getTitle(),
                task.isCompleted()
        );
    }

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<TaskResponse> getAllTasks(){
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponse(
                        task.getId(),
                        task.getTitle(),
                        task.isCompleted()
                ))
                .toList();
    }

    public TaskResponse getTaskById(Long id){
        log.debug("Searching task id={}", id);
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found=" + id));

        log.debug("Task found id={}", id);




        return mapToResponse(task);
    }

    public TaskResponse createTask(TaskRequest request){
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setCompleted(request.isCompleted());

        Task savedTask = taskRepository.save(task);

        return new TaskResponse(
                savedTask.getId(),
                savedTask.getTitle(),
                savedTask.isCompleted()
        );
    }

    public TaskResponse updateTask(Long id, TaskRequest request){
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));

        task.setTitle(request.getTitle());
        task.setCompleted(request.isCompleted());

        Task updated = taskRepository.save(task);

        return new TaskResponse(
                updated.getId(),
                updated.getTitle(),
                updated.isCompleted()
        );
    }

    public void deleteTask(Long id){
        log.info("Deletaing task id={}", id);

        if (!taskRepository.existsById(id)){
            log.warn("Task not found id={}", id);
           throw new TaskNotFoundException("Task not found");
        }

        taskRepository.deleteById(id);
        log.info("Task deleted id={}", id);
    }
}
