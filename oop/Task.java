package oop;

import java.util.Date;
import java.util.List;

import oop.interfaces.ITask;
import oop.libs.TaskInfo;
import oop.libs.TaskType;

@TaskInfo(author = "Harshana Wijesinghe", description = "Task tracker parent class. All starts here...", taskType = "Parent", version = 1.0)
public abstract class Task implements ITask<Task> {
    protected int id;
    private String title;
    private boolean isReminder;
    private Date reminderDate;
    private TaskType taskType;
    protected Date createdOn = new Date();

    private static int idIncrement;

    // Static initializer - does not needed here.
    // static {
    // idIncrement = 0;
    // }

    // Display a task
    public abstract void displayTaskById(int id);

    protected Task(String title, boolean isReminder, Date reminder, TaskType type) {
        this.id = ++idIncrement;
        this.title = (title != null && !title.isBlank()) ? title : "Untitled";
        this.isReminder = isReminder;
        this.reminderDate = reminder;
        this.taskType = type;
    }

    // Getters and setters
    // Getters---
    String getTitle() {
        return this.title;
    }

    boolean getIsReminder() {
        return this.isReminder;
    }

    Date getReminderDate() {
        return this.reminderDate;
    }

    TaskType getTaskType() {
        return this.taskType;
    }

    // Setters---
    void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    void setReminder(boolean isReminder) {
        this.isReminder = isReminder;
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
