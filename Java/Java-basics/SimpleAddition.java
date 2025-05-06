import java.util.Scanner;

/**
 * A simple Java program that reads two integers from the user,
 * calculates their sum, and displays the result.
 * This helps demonstrate basic input handling using the Scanner class.
 */
public class SimpleAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        input.close();
    }
}
