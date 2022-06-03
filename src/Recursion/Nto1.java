package Recursion;

//Program to Print Values from N to 1 using Recursion in Java
public class Nto1 {
    public void NTo1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        NTo1(n-1);
    }

    public void funcReverse(int n){
        if(n==0){
            return;
        }

        funcReverse(n-1);
        System.out.println(n);
    }
}
