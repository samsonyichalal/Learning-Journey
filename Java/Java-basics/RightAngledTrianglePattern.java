// This program prints a right-angled triangle pattern of asterisks (*) with 5 rows.
public class RightAngledTrianglePattern {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                    System.out.print(" *"); 
            }
            System.out.println();
        }
    }
}