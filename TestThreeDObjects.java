/*9. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and 
Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume (). 
Override these two methods in each of the derived classes to calculate the volume and 
whole surface area of each type of three-dimensional objects. The dimensions of the 
objects are to be taken from the users and passed through the respective constructors of 
each derived class. Write a main method to test these classes. 
 
 */

abstract class ThreeDObject {
    
    abstract float wholeSurfaceArea();
    abstract float volume();
}


class Box extends ThreeDObject {
    float length, width, height;

    
    public Box(float l, float w, float h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    
    @Override
    float wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    float volume() {
        return length * width * height;
    }
}

// Cube class extending ThreeDObject
class Cube extends ThreeDObject {
    float side;

    // Constructor
    public Cube(float side) {
        this.side = side;
    }

    // Implementing wholeSurfaceArea for Cube
    @Override
    float wholeSurfaceArea() {
        return 6 * side * side;
    }

    // Implementing volume for Cube
    @Override
    float volume() {
        return side * side * side;
    }
}

// Cylinder class extending ThreeDObject
class Cylinder extends ThreeDObject {
    float radius, height;

    // Constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Implementing wholeSurfaceArea for Cylinder
    @Override
    float wholeSurfaceArea() {
        return (float) (2 * Math.PI * radius * (radius + height));
    }

    // Implementing volume for Cylinder
    @Override
    float volume() {
        return (float) (Math.PI * radius * radius * height);
    }
}

// Cone class extending ThreeDObject
class Cone extends ThreeDObject {
    float radius, height;

    // Constructor
    public Cone(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Implementing wholeSurfaceArea for Cone
    @Override
    float wholeSurfaceArea() {
        float slantHeight = (float) Math.sqrt(radius * radius + height * height);
        return (float) (Math.PI * radius * (radius + slantHeight));
    }

    // Implementing volume for Cone
    @Override
    float volume() {
        return (float) (1.0 / 3 * Math.PI * radius * radius * height);
    }
}

// Main class to test the objects
public class TestThreeDObjects {
    public static void main(String[] args) {
        // Testing Box
        Box box = new Box(3, 4, 5);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Testing Cube
        Cube cube = new Cube(3);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Testing Cylinder
        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Testing Cone
        Cone cone = new Cone(3, 5);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
