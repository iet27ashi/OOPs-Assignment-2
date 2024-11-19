import java.util.Scanner;


public class chk_divisibility {
    


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        System.out.println("Enter the number:");
        int number = scn.nextInt();

       
        System.out.println("Enter the divisor:");
        int divisor = scn.nextInt();

       
        if (divisor != 0) {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        } else {
            System.out.println("Divisor cannot be zero.");
        }
    }
}


