import java.util.*;


public class calculator {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's a: ");
        int a = sc.nextInt();
        System.out.print("What's b: ");
        int b = sc.nextInt();
        System.out.print("What operation?? ");
        String c = sc.next();


        switch(c){
            case "addition" : System.out.println("Sum = " + a+b);
            break;

            case "substraction" : System.out.println(a-b);
            break;

            case "multiplication" : System.out.println(a*b);
            break;

            case "division" : System.out.println(a/b);
            break;

            default: System.out.println("Enter a valid case");

        }
        sc.close();
    }
    
}
