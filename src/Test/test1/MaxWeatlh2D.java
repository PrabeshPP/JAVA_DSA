package Test.test1;

import java.util.Scanner;

public class MaxWeatlh2D {
    public static void main(String[] args) {
        float var1 ,var2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        var1=scanner.nextFloat();
        System.out.println("Enter Number 2:");
        var2=scanner.nextFloat();
        if(var1 %2 ==1 && var2%2==1){
            System.out.println(var1-var2);
        }else if(var1 %2 ==0 && var2 %2 ==0){
            System.out.println(var1+var2);
        }else{
            if(var1>var2){
                System.out.println(var1/var2);

            }else{
                System.out.println(var2/var1);
            }
        }
    }
}