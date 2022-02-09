package Assignments.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        NumberStatus numberStatus=new NumberStatus();
//        System.out.print("Enter the number to check whether the given number is even or odd:");
//        int number=scanner.nextInt();
//        boolean isEven= numberStatus.isEven(number);
//        if(isEven){
//            System.out.println("The number is even.");
//        }else{
//            System.out.println("The number is odd.");
//        }

//        System.out.println("Please,enter your name!");
//        String name=scanner.nextLine();
//
//        Greetings greetings=new Greetings();
//        greetings.greet(name);


        SI si=new SI();
        System.out.print("Enter the principal amount:");
        double p=scanner.nextDouble();
        System.out.print("Enter the rate:");
        double r=scanner.nextDouble();
        System.out.print("Enter the time period:");
        double t=scanner.nextDouble();

        double simpleInterest=si.simpleInterest(p,t,r);

        System.out.println("The Simple Interest is "+simpleInterest);


    }

}
