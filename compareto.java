import java.util.*;

public class compareto {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the name of first person?? ");
        String name1 = sc.nextLine();
        System.out.print("What's the name of second person?? ");
        String name2 = sc.nextLine();

        // s1 > s2 : +ve value 
        // s1 == s2 : 0 
        // s1 < s2 : -ve value 

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        sc.close();

    }
}
