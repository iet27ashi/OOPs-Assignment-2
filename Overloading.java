public class Overloading {
    
        int id;
        String name;
      Overloading (int i, String n){
            id = i;
            name = n;
        }
        Overloading(){
            System.out.println("this is default constructor");
        }
        Overloading(int i){
            id = i;
            System.out.println("this is parameterized constructor giving information of id of student only");
        }
       
        public static void main(String[] args) {
            Overloading obj = new Overloading(19, "ashi");
            Overloading obj1 = new Overloading(19);
            Overloading obj2 = new Overloading();
        }
    }
    

