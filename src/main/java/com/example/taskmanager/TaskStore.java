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
    }

    public Task getTask(int ID) {
        for (Task task : taskList) {
            if (task.getId() == ID) {
                return task;
            }
        }
        return null;
    }

    public Task markCompleted(int ID) {
        for (Task task : taskList) {
            if (task.getId() == ID) {
                task.markDone();
                return task;
            }
        }
        return null;        
    }

    public List<Task> deleteTask(int ID) {
        Task removeTask = null;
        for (Task task : taskList) {
            if (task.getId() == ID) {
                removeTask = task;
                break;
            }
        }
        if (removeTask == null) {
            return null;
        }
        taskList.remove(removeTask);
        return taskList;        
    }

}
