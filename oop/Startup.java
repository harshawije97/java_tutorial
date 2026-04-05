package oop;

public class Startup {
    public static void main(String[] args) {
        TaskTracker task = new TaskTracker();

        // Default task
        task.createNewTask("Meeting with Joe", "Todo", true);
        System.out.println(task);

        // New task
        // task.createNewTask("Meeting with Joe", "Todo", true);
        // task.createNewTask("Lectures @ campus", "Todo", false);
        // task.createNewTask("Project proposal submission", "Todo", true);
    }
}
