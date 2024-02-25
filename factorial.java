import java.util.*;

public class factorial {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's n?? ");
        int n = sc.nextInt();

        int factorial = 1;
        if(n < 0){
            System.out.println("Ivalid Number");
        }else{
            for(int i = n; i >= 1; i--){
                factorial = factorial  * i;
            }
            System.out.println(factorial);
        }
        sc.close();
    }
}