public class numbers {
    public static void main(String[] args) {
        int number = 1;
        double gpa = 3.25;
        char status = 'M';

        @SuppressWarnings("unused")
        boolean isMarried = true;
        @SuppressWarnings("unused")
        String name = "Harshana Wijesinghe";

        System.out.println("Your number:%d".formatted(number));
        System.out.println("Your GPA is:" + gpa + "");

        if (status == 'M') {
            System.out.println("You are married");
        } else {
            System.out.println("Single the mingle you are...");
        }
    }
}
