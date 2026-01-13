package com.example.taskmanager;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TaskStore {
    fakeDatabase database;

    public TaskStore() {
        this.database = new fakeDatabase();
    }

    public Task createTask(String title) {
        Task task = new Task(title);
        database.storeTask(task);
        return task;
    }

    public List<Task> getTasks() {
        return database.retrieveAllTasks();        
    }

    public Task getTask(int ID) {
        Task task = database.retrieveTask(ID);
        return task;
    }

    public Task markCompleted(int ID) {
        Task task = database.retrieveTask(ID);
        if (task == null) {
             return null;
        }
        task.markDone();
        return task;      
    }

    public List<Task> deleteTask(int ID) {
        Task remove = database.removeTask(ID);
        if (remove == null) {
            return null;
        }
        return database.retrieveAllTasks();        
    }

}
