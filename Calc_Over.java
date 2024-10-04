// Assignment 2
// question 6. Write a Java program to show method overloading.
public class Calc_Over {
    
        int multiply(int a,int b){
           return a*b;
       }
       int multiply(int a,int b,int c){
            return  a*b*c;
       }
   
   public static void main(String[] args) {
   
        Calc_Over obj = new Calc_Over();
           int c = obj.multiply(5,4);
           int d = obj.multiply(5,4,3);
           System.out.println(c);
           System.out.println(d);
   
   }
   }
   
    

