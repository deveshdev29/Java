import java.util.*;

public class solid_rectangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        // Number of Rows 
        int n = sc.nextInt();

        // Number of columns 
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
    
}
