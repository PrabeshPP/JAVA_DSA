package DSA.Recursion;

public class FibonacciNumber {
    int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    //FibonacciNumber using Formula
    //This has good time complexity
    int fiboFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
