package Recursion;

public class Sum {
    public int Sum(int n){
        if(n==0){
            return 0;
        }
        int sum=n+Sum(n-1);
        return sum;
    }
}
