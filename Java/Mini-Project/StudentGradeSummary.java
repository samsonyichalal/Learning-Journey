// This program collects student exam scores, calculates their averages,
// determines pass/fail status, and summarizes the number of passing and failing students.

import java.util.Scanner;

public class StudentGradeSummary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of student in a class: ");
        int numberOfStudent = input.nextInt();
        input.nextLine();

        int numberOfPassStudent = 0;
        int numberOfFailStudent = 0;
        for(int i = 1; i <= numberOfStudent; i++){
            System.out.println("Enter name for student " + i);
            String nameOfStudent = input.nextLine();

            System.out.println("Enter exam one for " + nameOfStudent);
            int score1 = input.nextInt();

            System.out.println("Enter exam two for " + nameOfStudent);
            int score2 = input.nextInt();

            System.out.println("Enter exam three for " + nameOfStudent);
            int score3 = input.nextInt();

            double average = (score1 + score2+ score3) / 3.0;

            if(average >= 50){
                System.out.println("Name: " + nameOfStudent + "\nAverage: " + average + "\nStatus: Pass\n");
                numberOfPassStudent += 1;

            } else {
                System.out.println("Name: " + nameOfStudent + "\nAverage: " + average + "\nStatus: Fail\n");
                numberOfFailStudent += 1;
            }
        
            input.nextLine();
        }
        System.out.println("Number of Passed students: " + numberOfPassStudent);
        System.out.println("Number of Failed students: " + numberOfFailStudent);
        input.close();
    }
}