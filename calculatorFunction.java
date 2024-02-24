import java.util.*;

public class calculatorFunction {

    public static int Addition(int a,int b){
        return a+b;
    }

    public static int Substraction(int a,int b){
        return a-b;
    }

    public static int Multiplication(int a,int b){
        return a*b;
    }
    public static int Division(int a,int b){
        return a/b;
    }
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("What's a?? ");
        int a = sc.nextInt();

        System.out.print("What's b?? ");
        int b = sc.nextInt();


        System.out.print("What Operation you want to perform?? ");
        String operation = sc.next();

        switch(operation){
            case "Addition": System.out.println(Addition(a,b));
            break;

            case "Substraction":System.out.println(Substraction(a,b));
            break;

            case "Multiplication": System.out.println(Multiplication(a,b));
            break;

            case "Division": System.out.println(Division(a,b));
            break;

            default: System.out.println("Not a valid Operation");
        }
        sc.close();
    }
}
