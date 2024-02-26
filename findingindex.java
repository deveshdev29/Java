// Linear Search method

import java.util.*;

public class findingindex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the size of array?? ");
        int space = sc.nextInt();

        int[] number = new int[space];
        for(int i = 0;i<space;i++){
            System.out.print("Enter a number ");
            number[i] = sc.nextInt();
        }

        System.out.print("What number you want to find?? ");
        int find = sc.nextInt();

        for(int j = 0;j<=space;j++){
            if(number[j] != find){
                
            }else{
                System.out.println("The number you want to find is at index " + j);
                break;
            }
        }
        sc.close();
    }
}