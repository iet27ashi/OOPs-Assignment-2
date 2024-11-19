public class HCF {
   public static void main(String args[]){
    int a = 12;
    int b = 18;
    HCF_of_two hc = new HCF_of_two();
    int HCF=  hc.findHCF(12,18);
    System.out.println("hcf of" + a + "and" + b + "=" + HCF);

   }
}
//highest common factor
class HCF_of_two{
    int findHCF(int a, int b){
      if (b==0)
      return a;
      findHCF(a, a%b);
      return a%b;
    }
}