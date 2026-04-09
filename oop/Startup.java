package oop;

import java.util.Scanner;

import oop.features.Canvas;
import oop.libs.TaskType;

public class Startup {
    public static void main(String[] args) {
        Task task;

        // User input determines if it is a note or a drawing - runtime polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.println("What to Keep ? (NOTE, CANVAS, TODO)");
        String option = scanner.nextLine();

        try {
            TaskType taskType = TaskType.valueOf(option.toUpperCase());
            switch (taskType) {
                case NOTE:
                    task = new Note(null, false, null, TaskType.NOTE, "Lorem ipsum");
                    System.out.println(task.toString());
                    break;
                case CANVAS:
                    task = new Canvas("New Canvas", false, null, taskType, null);
                    System.out.println(task.toString());
                    break;
                case TODO:
                    System.out.println("Not Implemented Yet");
                    break;
                default:
                    System.out.println("Not Implemented Yet");
                    break;
            }
            /* Modern syntax - Java 21
             * switch (taskType) {
             * case NOTE -> task = new Note(null, false, null, TaskType.NOTE,
             * "Lorem ipsum");
             * case CANVAS -> task = new Canvas("New Canvas", false, null, taskType, null);
             * default -> System.out.println("Not Implemented Yet");
             * }
             */

        } catch (Exception e) {
            System.out.println("Invalid option. Please check before input");
        }

        scanner.close();
    }
}
