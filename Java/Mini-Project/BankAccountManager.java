// Basic banking operations for a single user.
// It allows deposits, withdrawals, balance checks, and handles user input with basic validation.
import java.util.Scanner;

public class BankAccountManager {

    Scanner input = new Scanner(System.in);

    double balance =0;
    String name;

    public static void main(String[] args){

        BankAccountManager bam = new BankAccountManager();

        System.out.println("\nTo create an account enter your name and intial balance");
        System.out.println("Enter your name: ");
        bam.name = bam.input.nextLine();

        System.out.println("Enter initial balance: ");
        double initialBalance = bam.input.nextDouble();
        bam.input.nextLine();

        bam.balance += initialBalance;

        bam.menu();

        bam.input.close();
    }

    public void menu(){

        int choice = 1;
        while(choice != 4){
            System.out.println("\nHello, " + name + "! Choose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money ");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            choice = input.nextInt();

            if(choice == 1){
                deposit();
            } else if(choice == 2){
                withdraw();
            } else if(choice == 3){
                check();
            } else if(choice == 4){
                System.out.println("Thank you! Goodbye.");
            } else {
                System.out.println("Please enter the correct number betweem 1 and 4!");
            }
        }
    }

    public void deposit(){
        
        System.out.println("Enter the amount you want to deposit: ");
        double depositAmount = input.nextDouble();
        input.nextLine();

        if(depositAmount > 0){

            balance += depositAmount;

            System.out.println("You have successfully deposited: $" + depositAmount);
            System.out.println("Your balance is: $" + balance);
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    public void withdraw(){
        
        System.out.println("Enter the amount you want to withdraw: ");
        double withdrawAmount = input.nextDouble();
        input.nextLine();

        if(withdrawAmount <= balance && withdrawAmount > 0){
            balance -= withdrawAmount;

            System.out.println("You have successfully withdrawn: $" + withdrawAmount);
            System.out.println("Your balance is: $" + balance);
        } else {
            System.out.println("Sorry, Either your balance is insufficient or you entered negative amount.");
        }
    }

    public void check(){
        
        System.out.println("Your balance is: $" + balance);
        
    }
}
