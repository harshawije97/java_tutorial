package oop;

import java.util.Date;

public class Note extends Task {

    private String description;

    public Note(String title, boolean isReminder, Date reminder, String type, String description) {
        super(title, isReminder, reminder, type);
        this.description = description;
    }

    void createNewNote() {
        System.out.println("Id:" + id);
        System.out.println("Task:" + title);
        System.out.println("Description:" + description);
        System.out.println("Created On:" + createdOn);
    }

    @Override
    public void displayTaskById(int id) {
        System.out.println("Your task id is: " + id);
    }

    // Get the task which is created recently
    @Override
    public String toString() {
        return super.toString() + "Task {" +
                "\n  id=" + id +
                "\n  title='" + title + '\'' +
                "\n  isReminder=" + isReminder +
                "\n  reminderDate='" + reminderDate + '\'' +
                "\n  taskType='" + taskType + '\'' +
                "\n  description='" + description + '\'' +
                "\n  createdOn=" + createdOn +
                "\n}";
    }

}
