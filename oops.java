class Pen{

    // defining properties
    String color;
    String type;

    // methods
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called");
    }
}

public class oops {
    public static void main(String[] args){

        // Creating an object
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        Student s1 = new Student(); //Student() is a constructor: alled while constructing an object
        Student s2 = new Student();

        // giving properties
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen2.color = "Black";
        pen2.type = "Ball point";

        s1.name = "Dev";
        s1.age = 20;

        s2.name = "khushi";
        s2.age = 20;


        // calling method
        pen1.write();
        pen1.printColor();

        pen2.printColor();

        s1.printInfo();
        s2.printInfo();
    }
}
