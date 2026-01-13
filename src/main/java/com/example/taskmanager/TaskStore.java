package com.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskStore {
    fakeDatabase database;
    List<Task> taskList;

    public TaskStore() {
        this.taskList = new ArrayList<Task>();
        this.database = new fakeDatabase();
    }

    public Task createTask(String title) {
        Task task = new Task(title);
        database.storeTask(task);
        return task;
    }

    public List<Task> getTasks() {
        return taskList;        
    }

    public Task getTask(int ID) {
        Task task = database.retrieveTask(ID);
        return task;
    }

    public Task markCompleted(int ID) {
        Task task = database.retrieveTask(ID);
        if (task != null) {
            task.markDone();
        }
        return task;      
    }

    public List<Task> deleteTask(int ID) {
        Task task = database.retrieveTask(ID);
        if (task == null) {
            return null;
        }
        taskList.remove(task);
        return taskList;        
    }

}
