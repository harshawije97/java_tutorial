public class Reference {
    public static void main(String[] args) {
        // Arrays
        String[] names = new String[4];

        names[0] = "Harshana";
        names[1] = "Jagath";
        names[2] = "Sugath";

        // Size of the array
        System.out.println("Size of the array is: " + names.length);

        // How many indexes have values
        int index = 0;
        for (String name : names) {
            if (name != null) {
                index++;
            }
        }
        System.out.println("Used indexes of the array:" + index);

        // How many has been left
        int undefined = 0;
        for (String name : names) {
            if (name == null) {
                undefined++;
            }
        }
        System.out.println("Unused indexes of the array:" + undefined);
    }
}
