import java.util.*;

public class arrays {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.print("What's your Math marks?? ");
        marks[0] = sc.nextInt();

        System.out.print("What's your Computer marks?? ");
        marks[1] = sc.nextInt();

        System.out.print("What's your Physics marks?? ");
        marks[2] = sc.nextInt();

        System.out.print("What's your Pschology marks?? ");
        marks[3] = sc.nextInt();

        System.out.print("What's your Cybersecurity marks?? ");
        marks[4] = sc.nextInt();

        System.out.println("Your total Marks are: "+ (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]));
        sc.close();
    }
}
