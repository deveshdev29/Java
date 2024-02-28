import java.util.*;

public class guessthenumber {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int number = random.nextInt(1001);

        do{
            System.out.print("What's your guess?? ");
            int guess = sc.nextInt();
            if (guess>number) {
                System.out.println("Guess Lower");
            }
            else if (guess<number) {
                System.out.println("Guess Higher");
            }
            else{
                System.out.println("------------------You Guessed right-----------------------");
                break;
            }
        }while(true);

        sc.close();
    }
} 