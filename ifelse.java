import java.util.*;

public class ifelse {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a button? ");
        int button = sc.nextInt();

        if(button==1){
            System.out.println("You pressed 1");
        } else if(button==2){
            System.out.println("You pressed 2");
        }else{
            System.out.println("Jai shree ram");
        }
        sc.close();
    }
    
}
