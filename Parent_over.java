public class Parent_over {
    
        int a;
        public void show()
        {
            System.out.println("this is parent");
        }
    }

        class Child extends Parent_over{
            int a=10; 

            public void show()
            {
                System.out.println("this is child method");
            } 
        }
        class Main{
            public static void main(String []args){
                Child c=new Child();
                c.show(); //call the child class override method
                   }   
        }

// in overriding parameters should be same, function name same but function work differ