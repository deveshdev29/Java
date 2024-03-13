import java.util.*;

public class arrayList {
    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();

        // Add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Get element
        int element = list.get(1);
        System.out.println(element);

        // Add element in between
        list.add(1, 1);
        System.out.println(list);

        // Set element
        list.set(0, 5);
        System.out.println(list);

        // Delete element
        list.remove(0);
        System.out.println(list);

        // Size of ArrayList
        int size = list.size();
        System.out.println("Size = " + size);

        // Loops
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        // Sort
        Collections.sort(list);
    }
}
