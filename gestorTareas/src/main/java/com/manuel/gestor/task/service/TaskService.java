package com.manuel.gestor.task.service;

import com.manuel.gestor.task.model.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TaskService {

    private final TaskRepository taskRepository;
}
