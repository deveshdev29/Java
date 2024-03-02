class Student{
    String name;
    int age;

    // Polymorphism : method overloading
    // calling different method with same name
    // there should be some diffrentiating factor

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class methodOverloading{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 20;

        s1.printInfo(s1.name,s1.age);
    }
}