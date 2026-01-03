package com.example.taskmanager;

public class IdGenerator {
    private int ID = 1;

    public int next() {
        return ID++;
    }
}