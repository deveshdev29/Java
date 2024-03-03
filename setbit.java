public class setbit {
    public static void main(String args[]){

        // it sets the given position to 1 

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}