import java.util.*;

public class substrings {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // strings are immutable 

        String name = "Tony Stark";
        String firstname = name.substring(0,4);
        String secondname = name.substring(5);

        System.out.println(firstname);
        System.out.println(secondname);

        sc.close();
    }
}