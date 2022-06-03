package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the number of which you want to have the factorial :");
//        int x=scanner.nextInt();
//        int fact=factorial(x);
//        System.out.println(fact);

//        Nto1 nto1=new Nto1();
//        nto1.funcBoth(5);

        Product product=new Product();
        int totalProduct=product.product(3);
        System.out.println(totalProduct);
    }

   static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            int total;
            total=n* factorial(n - 1);
            return total;

        }

    }
}
