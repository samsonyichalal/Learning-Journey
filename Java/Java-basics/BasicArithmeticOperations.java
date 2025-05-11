// Promots the user to enter two integers and performs basic arithmetic operations

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);

        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        double division = (double)num1 / num2;
        System.out.println(num1 + " divided by " + num2 + " is " + division);
        input.close();
    }
}
