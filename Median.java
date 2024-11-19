import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
      double median;
        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            median = arr[n / 2];
        }
        System.out.println("Median: " + median);

        input.close();
    }
}
