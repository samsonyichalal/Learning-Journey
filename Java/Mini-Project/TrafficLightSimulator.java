/*  a basic traffic light simulator that takes user input and 
    displays the corresponding action based on traffic signal color
*/

import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter traffic signal color: ");
        String signal = input.nextLine();

        String signalColor = signal.toUpperCase();
        System.out.println(signalColor);
        if(signalColor.equals("GREEN")){
            System.out.println("Action: Go!");
        } else if(signalColor.equals("YELLOW")){
            System.out.println("Action: Slow down and prepare to stop.");
        } else if(signalColor.equals("RED")){
            System.out.println("Action: Stop!");
        } else {
            System.out.println("Invalid input! Please enter Red, Yellow, or Green.");
        }
        input.close();
    } 
}
