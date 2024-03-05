// This program prints the sum of n natural numbers 

import java.util.*;

public class sum_numbers {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;

        while(i <= n){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);


        sc.close();
    }
    
}
