package oop.features;

import java.util.Date;
import java.util.List;

import oop.Task;
import oop.libs.TaskType;

public class Note extends Task {

    private String description;

    public Note(String title, boolean isReminder, Date reminder, TaskType type, String description) {
        super(title, isReminder, reminder, type);
        this.description = description;
    }

    @Override
    public List<Task> getTasks(String type) {
        return null;
    }

    @Override
    public void createNewTask(Task task) {
        System.out.println("Task is created successfully...");
    }

    @Override
    public void displayTaskById(int id) {
        System.out.println("Your task id is: " + id);
    }

    @Override
    public void updateTask(int id, Task task) {
        System.out.println("Id of the note: " + id + "\n Note: " + task);
    }

    @Override
    public String deleteTask(int id) {
        if (this.getId() == id) {
            return "Note with id " + id + " has been deleted.";
        }
        return "Note with id " + id + " not found.";
    }

    // Get the task which is created recently
    @Override
    public String toString() {
        return super.toString() +
                "\n  description='" + description + '\'' +
                "\n}";
    }

}
