// a program to find the smallest element in a static integer array.

public class FindSmallestElement {
    public static void main(String[] args){

        int[] list = {23, 45, 67, 34, 19, 12, 17, 92, 86};

        int smallestElement = list[0];
        int lengthOfArray = list.length;

        for(int i = 0; i < lengthOfArray; i++){
            if(list[i] < smallestElement) {
                smallestElement = list[i];
            }
        }
        System.out.println("The smallest element from the list is: " + smallestElement);
    }
}
