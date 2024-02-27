import java.util.*;

public class functionCalling{

    public static void printMyName(String name){
        System.out.println("Hello " + name);
        return;
    }
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("What's Your Name?? ");
        String name = sc.next();

        printMyName(name);

        sc.close();
    }
}