package com.ft.ft_task.service;

import com.ft.ft_task.entity.Task;
import org.springframework.stereotype.Service;

import com.ft.ft_task.repository.TaskRepository;


import java.util.List;

@Service 
public class TaskService {
    
    private final TaskRepository repo;

    public TaskService(TaskRepository repo){
        this.repo = repo;
    }

    public List<Task> getAllTasks(){
        return (List<Task>) repo.findAll();
    }

}
