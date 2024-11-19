import java.util.Scanner;

public class Dec_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.next();
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        System.out.println("Decimal equivalent: " + decimal);

        System.out.print("Enter a decimal number: ");
        int decInput = input.nextInt();
        StringBuilder binaryResult = new StringBuilder();

        int num = decInput;
        while (num > 0) {
            binaryResult.append(num % 2);
            num /= 2;
        }

        System.out.println("Binary equivalent: " + binaryResult.reverse().toString());

        input.close();
    }
}
