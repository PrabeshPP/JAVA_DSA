package Assignments.two;

public class Fibonacci {
    void printFibonacci(int n){
        int a=0;
        int b=1;
        int temp;
//        System.out.print(a+",");
        while(b<n){

            temp=b;
            b=b+a;
            a=temp;


        }
        System.out.print(a+",");
    }
}
