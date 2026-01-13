package com.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class fakeDatabase {
    List<Task> taskList;

    public fakeDatabase() {
        this.taskList = new ArrayList<Task>();
    }

    public void storeTask(Task task) {
        taskList.add(task);
    }

    public List<Task> retrieveAllTasks() {
        return taskList;
    }

    public Task retrieveTask(int ID) {
        for (Task task : taskList) {
            if (task.getId() == ID) {
                return task;
            }
        }
        return null;
    }

    public Task removeTask(int ID) {
        Task task = retrieveTask(ID);
        if (task != null) {
            taskList.remove(task);
        }
        return task;
    }
}
