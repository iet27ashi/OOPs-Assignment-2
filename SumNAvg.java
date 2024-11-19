 //24. Write a Java program to calculate Sum & Average of an integer array
 import java.util.Scanner;

public class SumNAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no of elements in the array: ");
        int n = input.nextInt();

        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / n;
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + avg);

        input.close();
    }
}


