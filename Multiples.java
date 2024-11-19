import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start = scn.nextInt();

        System.out.println("Enter the ending number:");
        int end = scn.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
