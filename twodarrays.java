import java.util.*;

public class twodarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the number of Rows?? ");
        int rows = sc.nextInt();

        System.out.print("What's the number of columns?? ");
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];

        for(int i = 0; i<rows ; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Enter the number: ");
                matrix[i][j] = sc.nextInt();

            }
            
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
    
}
