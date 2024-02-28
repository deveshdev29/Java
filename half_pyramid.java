import java.util.*;

public class half_pyramid {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Rows? "); 
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}