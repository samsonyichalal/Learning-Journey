// This program checks whether a given integer is even or odd.
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number(Integer): ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        input.close();
    }
    
}
