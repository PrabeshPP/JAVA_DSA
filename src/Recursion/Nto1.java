package Recursion;

public class Nto1 {
    public void NTo1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        NTo1(n-1);
    }
}
