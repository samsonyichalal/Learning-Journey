import java.util.Scanner;

public class CountdownWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (1-7): ");
        int num = input.nextInt();

        while(num > 0){
            System.out.println(num);
            num--;
        }
        input.close();
    }    
}
