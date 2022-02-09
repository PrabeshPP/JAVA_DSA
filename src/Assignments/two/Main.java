package Assignments.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NumberStatus numberStatus=new NumberStatus();
        System.out.print("Enter the number to check whether the given number is even or odd:");
        int number=scanner.nextInt();
        boolean isEven= numberStatus.isEven(number);
        if(isEven){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }

    }

}
