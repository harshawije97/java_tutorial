package oop.features;

import java.util.Date;
import java.util.List;

import oop.Task;
import oop.interfaces.ITaskEvent;
import oop.libs.TaskType;

public class TaskEvent extends Task implements ITaskEvent {

    protected TaskEvent(String title, boolean isReminder, Date reminder, TaskType type) {
        super(title, isReminder, reminder, type);
    }

    @Override
    public void setTaskEvent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTaskEvent'");
    }

    @Override
    public void displayTaskById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayTaskById'");
    }

    @Override
    public void createNewTask(Task task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNewTask'");
    }

    @Override
    public List<Task> getTasks(String type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTasks'");
    }

    @Override
    public void updateTask(int id, Task task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
    }

    @Override
    public String deleteTask(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
    }
    
}
