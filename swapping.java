//4. Write a Java program to swap two numbers. 
public class swapping {
    public static void main(String[] args) {
        Num num = new Num();
        int swappednum= num.swap(14,80);
        System.out.println("after swapping num1="+  swappednum );
    }
}class Num{
    int num1;
    int num2;
    int temp;
    public int swap(int num1, int num2){
         num1 = temp;
         temp = num1;
         num2 = temp;
    
}}