package oop;

import java.util.Date;

public class TaskTracker {

    private int id;
    private String taskName;
    private boolean isReminder;
    private String reminderDate = null;
    private String taskType;
    private Date createdOn = new Date();
    // ID increment
    private static int idIncrement;

    // static initializer runs before everything.
    static {
        idIncrement = 0;
    }

    public TaskTracker() {
        this.taskName = "Untitled";
        this.taskType = "Empty";
        this.isReminder = false;
        this.reminderDate = isReminder ? reminderDate : null;
    }

    void createNewTask() {
        this.id = ++idIncrement;
    }

    void createNewTask(String task, String taskType, boolean isReminder) {
        this.id = ++idIncrement;
        this.taskName = task;
        this.taskType = taskType;
        this.isReminder = isReminder;

        if (isReminder) {
            Date reminder = new Date();
            reminderDate = reminder.toString();

            System.out.println("Reminder is on...");
        }

    }

    @Override
    public String toString() {
        return "Task Created: " +
                "\n ID: " + id +
                "\n Title: " + taskName +
                "\n Type: " + taskType +
                "\n Reminder: " + isReminder +
                "\n Reminder Date: " + reminderDate +
                "\n Created on: " + createdOn;
    }
}
