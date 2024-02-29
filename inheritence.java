// Base class or Super-class
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

// Hybrid Inheritence : combination of multiple inheritance and multilevel inheritance

// Sub-class
class Triangle extends Shape{ // Single level Inheritence

    // Inheritence : Triangle class inherit the properties and methods of Shape
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{ // Multi-level Inheritence
    public void area(int l){
        System.out.println();
    }
}

// Hierarchial Inheritence : many Sub-class of same base class
class Circle{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class inheritence {
    public static void main(String args[]){

        Triangle t1 = new Triangle();
    }
}