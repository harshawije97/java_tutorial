public class main {
    volatile static int age; // uses in multithreading
    transient String passwordString; // does not save into the database (in serialization)
    public static void main(String[] args) {
        System.out.println("Your age is: %d".formatted(age = 29));
    }
}