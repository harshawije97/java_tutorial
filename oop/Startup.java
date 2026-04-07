package oop;

import java.util.Date;

import oop.features.Canvas;
import oop.libs.TaskType;

public class Startup {
    public static void main(String[] args) {
        Note note = new Note("My new note", false, new Date(), TaskType.NOTE,
                "This is a simple sample note created for demonstration purposes. It contains exactly twenty five words and shows how concise writing can still communicate clearly");
        // note.createNewNote();

        Note updatedNote = new Note("Daily Reminder", true, new Date(), TaskType.NOTE,
                "Remember to complete your assignments on time and review your code carefully. Consistent practice improves programming skills and helps you become a more confident developer");

        // View record
        note.displayTaskById(1);
        note.updateTask(1, updatedNote);

        Canvas canvas = new Canvas(null, false, null, TaskType.CANVAS, null);
        System.out.println(canvas.taskType);
    }
}
