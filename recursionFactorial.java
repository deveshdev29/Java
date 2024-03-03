public class recursionFactorial {

    public static int factorial(int n){

        if(n == 1 || n == 0){
            return 1;
        }
        int fac_n_1 = factorial(n-1);
        int fac_n = n * fac_n_1;
        return fac_n;
    }
    public static void main(String args[]){
        int n = 5;
        int answer = factorial(n);
        System.out.println(answer);
    }

}
