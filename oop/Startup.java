package oop;

import java.util.Date;

public class Startup {
    public static void main(String[] args) {
        Note note = new Note("My new note", false, new Date(), "Notes",
                "This is a simple sample note created for demonstration purposes. It contains exactly twenty five words and shows how concise writing can still communicate clearly");
        note.createNewNote();

        // View record
        note.displayTaskById(1);
    }
}
