package oop;

import java.util.Date;
import java.util.List;

import oop.interfaces.ITask;

public abstract class Task implements ITask<Task> {
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

    @Override
    public abstract void createNewTask(Task task);

    @Override
    public abstract List<Task> getTasks(String type);

    @Override
    public abstract void updateTask(int id, Task task);

    @Override
    public abstract String deleteTask(int id);

    @Override
    public String toString() {
        return "Task {" +
                "\n  id=" + id +
                "\n  title='" + title + '\'' +
                "\n  isReminder=" + isReminder +
                "\n  reminderDate='" + reminderDate + '\'' +
                "\n  taskType='" + taskType + '\'' +
                "\n  createdOn=" + createdOn +
                "\n}";
    }
}
