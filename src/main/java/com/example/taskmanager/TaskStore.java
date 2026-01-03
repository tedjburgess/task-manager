package com.example.taskmanager;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TaskStore {
    ArrayList<Task> taskList;

    public TaskStore() {
        this.taskList = new ArrayList<Task>();
    }

    public Task createTask(String title) {
        Task task = new Task(title);
        return task;
    }
}
