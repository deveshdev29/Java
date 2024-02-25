public class clearbit {
    public static void main(String args[]){

        // clear bit : converts the given position to 0
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        int notBitMask = ~(bitmask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
        
    }
    
}
