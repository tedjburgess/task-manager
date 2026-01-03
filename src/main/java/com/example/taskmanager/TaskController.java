package com.example.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TaskController {
    @PostMapping("/tasks")
    public String createTask(@RequestBody String title) {
        Task task = new Task(title);
        String taskInfo = task.testGetInfo();
        return taskInfo;
    }
}
