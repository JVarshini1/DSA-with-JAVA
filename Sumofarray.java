import java.util.*;

public class Sumofarray {
    public static void main(String args[]) {
        
        int sum = 0;
        int arr[] = {3, 6, 9, 0, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        
        System.out.println("Sum of array elements: " + sum);
    }
}