package com.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskStore {
    List<Task> taskList;
    StringBuilder sb = new StringBuilder("List: \n");

    public TaskStore() {
        this.taskList = new ArrayList<Task>();
    }

    public Task createTask(String title) {
        Task task = new Task(title);
        taskList.add(task);
        return task;
    }

    public List<Task> getTasks() {
        return taskList;
        
        
        // if (taskList.size() != 0) {
        //     for (Task task: taskList) {
        //         sb.append("ID: " + task.getId());
        //         sb.append("Title: " + task.getTitle());
        //         sb.append("Status: " + task.isStatus());
        //     }
        //     return sb;
        // }
        // sb.append("Empty");
        // return sb;
    }
}
