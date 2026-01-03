package com.example.taskmanager;

public class Task {
    int id;
    String title;
    Boolean status;
    private static final IdGenerator generatedId = new IdGenerator();

    public Task(String title) {
        this.title = title;
        this.id = generatedId.next();
        this.status = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isStatus() { return status; }

    public String testGetInfo() {
        return ("ID: " + id + "\n" +
            "Title: " + title + "\n" +
            "Status: " + status + "\n"
        );        
    }

    



    
}
