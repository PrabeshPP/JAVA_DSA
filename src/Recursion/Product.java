package Recursion;

public class Product {
    public static int product(int n){
        if(n==0){
            return 1;
        }
        int product=n*product(n-1);
        return product;
    }
}
