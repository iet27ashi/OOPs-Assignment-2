import java.util.Scanner;
public class Find_MAXX {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter all 3 nums");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        Number N = new Number();
        
        int maximum = N.find_max(num1, num2, num3);
        System.out.println("maximum:" + maximum);
    }
}
class Number{
    int num1;
    int num2;
    int num3;
    public int find_max(int num1, int num2, int num3){
        if (num1>num2 && num1>num3){
           return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;}
        else {
          return num3;
        }

    }
}
