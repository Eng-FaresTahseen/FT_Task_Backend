package com.ft.ft_task.controller;
import com.ft.ft_task.entity.Task;
import com.ft.ft_task.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

}
