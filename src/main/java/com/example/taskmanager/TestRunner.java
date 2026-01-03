package com.example.taskmanager;

public class TestRunner {
    public static void main(String[] args) {
        testObject();
    }

    public static void testObject() {
        Task task1 = new Task("Test 1");
        String task1Info = task1.testGetInfo();
        System.out.println(task1Info);
        Task task2 = new Task("Test 2");
        String task2Info = task2.testGetInfo();
        System.out.println(task2Info);
        Task task3 = new Task("Test 3");
        String task3Info = task3.testGetInfo();
        System.out.println(task3Info);
    }
}
