package com.ft.ft_task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ft.ft_task.entity.Task;

public interface TaskRepository extends JpaRepository<Task , UUID> {

}
