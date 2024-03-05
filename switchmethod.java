import java.util.*;

public class switchmethod {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        switch(cases){
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Jai shree ram");
        }
        sc.close();
        
    }
    
}
