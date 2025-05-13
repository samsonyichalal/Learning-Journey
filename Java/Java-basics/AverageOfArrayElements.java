// a program that calculates the average of elements in an integer array.

public class AverageOfArrayElements {
    public static void main(String[] args){

        int[] list = {23, 45, 67, 34, 19, 12, 17, 92, 86};

        double average, sum = 0;
        int lengthOfArray = list.length;

        for(int i = 0; i < lengthOfArray; i++){
            sum += list[i];
        }
        average = sum / lengthOfArray;
        System.out.println("The average of list is: " + average);
    }
}
