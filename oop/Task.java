package oop;

import java.util.Date;

public abstract class Task {
    protected int id;
    protected String title = "Untitled";
    protected boolean isReminder;
    protected Date reminderDate = null;
    protected String taskType;
    protected Date createdOn = new Date();

    private static int idIncrement;

    static {
        idIncrement = 0;
    }

    // Display a task
    public abstract void displayTaskById(int id);

    protected Task(String title, boolean isReminder, Date reminder, String type) {
        this.id = ++idIncrement;
        this.title = title;
        this.isReminder = isReminder;
        this.reminderDate = reminder;
        this.taskType = type;
    }

    void setReminder(Date reminderDate) {
        this.reminderDate = reminderDate;
    }
}
