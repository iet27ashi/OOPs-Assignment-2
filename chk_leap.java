import java.util.Scanner;

public class chk_leap {
    public static void main(String[] args) {
        
        System.out.println("enter year");
        Scanner scn = new Scanner(System.in);
        int y= scn.nextInt();
        if((y%100 == 0) && ( y%400 == 0) || (y%100 != 0) && (y%4==0)){
            System.out.println("yes this year is Leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}