
class Animal {
    
    public void sound() {
        System.out.println("Animals make sound");
    }
}

// here dog is child class
class Dog extends Animal {
     public void sound() {
        System.out.println("Dog barks");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
    
        dog.sound(); // Output: Dog barks
      
    }
}
