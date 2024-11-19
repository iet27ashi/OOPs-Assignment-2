public class Student_const {

        String name;
        int id;
        Student_const(int i, String n){
              id = i;
              name = n;
        }
        void display(){
            System.out.println("id:" + id +name);
        }
        public static void main(String[] args) {
            Student_para s1 = new  Student_para(19," Ashi");
            Student_para s2 = new  Student_para(18," Shlok");
            s1.display();
            s2.display();
            
        }
    }
    

