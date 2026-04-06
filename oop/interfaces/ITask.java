package oop.interfaces;

import java.util.List;

public interface ITask<T> {
    void createNewTask(T task);

    List<T> getTasks(String type);

    void updateTask(int id, T task);

    String deleteTask(int id);
}
