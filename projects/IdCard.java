package projects;

import java.util.Scanner;

public class IdCard {
    private static String fullName;
    private static int age;
    private static int birthYear;

    static long createIDNumber(int age, int year) {
        long calculate = Math.multiplyFull(age, year);

        return calculate;
    }

    // Method overloading
    static long createIDNumber(int age, int year, int length, char character){
        long calculate = Math.multiplyExact(age, year) * length;

        return calculate;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("Enter your name: ");
        fullName = scanner.nextLine();
        System.out.print("Enter your age:");
        age = scanner.nextInt();
        System.out.print("Enter your birth year only:");
        birthYear = scanner.nextInt();

        // Answers:
        System.out.println("Name," + fullName);
        System.out.print("Age," + age + "\n Year of birth,\n" + birthYear + "\n");

        Object newIdNumber = createIDNumber(age, birthYear);
        System.out.println("Your new Id number is: %s".formatted(newIdNumber.toString()));

        scanner.close();
    }
}