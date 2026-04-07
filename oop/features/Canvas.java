package oop.features;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oop.Shape;
import oop.Task;
import oop.interfaces.ICanvas;

public class Canvas extends Task implements ICanvas {

    private ArrayList<Shape> drawingMeta;

    protected Canvas(String title, boolean isReminder, Date reminder, String type, ArrayList<Shape> meta) {
        super(title, isReminder, reminder, type);
        this.drawingMeta = meta;
    }

    @Override
    public void displayTaskById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'displayTaskById'");
    }

    @Override
    public void createNewTask(Task task) {
        throw new UnsupportedOperationException("Unimplemented method 'createNewTask'");
    }

    @Override
    public List<Task> getTasks(String type) {
        throw new UnsupportedOperationException("Unimplemented method 'getTasks'");
    }

    @Override
    public void updateTask(int id, Task task) {
        throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
    }

    @Override
    public String deleteTask(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
    }

    @Override
    public String syncShape() {
        throw new UnsupportedOperationException("Unimplemented method 'syncShape'");
    }

}
