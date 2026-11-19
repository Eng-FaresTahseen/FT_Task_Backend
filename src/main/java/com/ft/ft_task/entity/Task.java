package com.ft.ft_task.entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    private UUID id;
    @Column(nullable=false)
    private String title;
    private String description;
    private boolean completed;
    private Instant createdAt;
    private Instant updatedAt;

    public Task(){
        
    }
}
