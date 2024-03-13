import java.util.*;
public class age {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's Your Age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
        sc.close();
    }
    
}
