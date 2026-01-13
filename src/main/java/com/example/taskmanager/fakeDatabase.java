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
}
