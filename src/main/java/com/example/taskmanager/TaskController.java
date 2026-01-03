package com.example.taskmanager;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TaskController {
    private final TaskStore store;

    public TaskController(TaskStore store) {
        this.store = store;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody String title) {
        return store.createTask(title);
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return store.getTasks();
    }

    @GetMapping("/tasks/{ID}")
    public Task getTask(@PathVariable int ID) {
        return store.getTask(ID);
    }
}
