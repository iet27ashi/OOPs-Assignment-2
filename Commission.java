  /*33. Write a class, Commission, which has an instance variable, sales; an appropriate 
constructor; and a method, commission() that returns the commission.Now write a demo class 
to test the Commission class by reading a sale from the user, using it to create a Commission 
object after validating that the value is not negative. Finally, call the commission() method to 
get and print the commission. If the sales are negative, your demo should print the message 
“Invalid Input” */
  
  import java.util.Scanner;
    public class Commission {

    private double sales;
    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.1; 
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amt: ");
        double input = sc.nextDouble();
        if (input < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission comm = new Commission(input);
            double result = comm.commission();
            System.out.println("The commission is= " + result);
        }
        sc.close();
    }
}


