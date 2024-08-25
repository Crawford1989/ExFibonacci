public class Fibonacci {

    public static int Math(int n){
        if(n <= 1){
            return n;
        }
        int fib1 = 0, fib2 = 1, fib = 1;
        for(int i = 2; i <= n; i++){
        fib = fib1 + fib2;
        fib1 = fib2;
        fib2 = fib;
        }
        return fib;
    }


}
