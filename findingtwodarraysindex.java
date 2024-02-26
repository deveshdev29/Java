import java.util.*;

public class findingtwodarraysindex {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        System.out.print("What's the number of rows?? ");
        int rows = sc.nextInt();

        System.out.print("What's the number of columns?? ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        // taking inputs 
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print("Enter the number: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output 
        for(int i = 0; i<rows; i++){
            for(int j =0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        // finding index 
        System.out.print("What number do you want to find?? ");
        int finding = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j]==finding){
                    System.out.println("The index of the number you want to find is " + i + "," + j);
                }
            }
        }
        sc.close();
    } 
}