public class getbit {
    public static void main(String args []){

        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos;

        // get bit : checks if a position was 0 or 1 
        // 1. Bit mask : 1 << pos 
        // 2. Operation : And 

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
}