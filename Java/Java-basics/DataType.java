public class DataType {
    public static void main(String[] args){

        /* 
         * store students information in the appropriate data type
         * Includes: String, int, char, double, boolean.
         */
        String name = "Samson";
        int age = 20;
        char grade = 'A';
        double height = 1.60;
        boolean single = true;

        // display students information
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
        System.out.printf("Student Height: %.2f%n", height);
        System.out.println("Does the student single: " + single);
    }
}
