public class fibonacci {

    public static void printfibonacci(int a, int b, int n){

        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfibonacci(b, c, n-1);
    }
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int n = 100;
        System.out.println(a);
        System.out.println(b);
        
        printfibonacci(a, b, n-2);
    }
}