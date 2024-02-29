import java.util.*;

public class hollow_rectangle {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Rows? ");
        int n = sc.nextInt();

        System.out.print("Number of Colummns? ");
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
    
}
