package DSA.Recursion;

public class FibonacciNumber {
    int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}