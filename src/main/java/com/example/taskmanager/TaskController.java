package com.example.taskmanager;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController

public class TaskController {
    private final TaskStore store;

    public TaskController(TaskStore store) {
        this.store = store;
    }

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody String title) {
        return store.createTask(title);
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        List<Task> list = store.getTasks();
        if (list.size() == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return list;
    }

    @GetMapping("/tasks/{ID}")
    public Task getTask(@PathVariable int ID) {
        Task task = store.getTask(ID);
        if (task == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return task;
    }

    @PostMapping("/tasks/{ID}")
    public Task taskDone(@PathVariable int ID) {
        Task task = store.markCompleted(ID);
        if (task == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return task;
    }

    @DeleteMapping("/tasks/{ID}")
    public List<Task> deleteTask(@PathVariable int ID) {
        List<Task> list = store.deleteTask(ID);
        if (list == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return list;
    }
}
