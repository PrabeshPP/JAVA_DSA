import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
       Scanner  scanner=new Scanner(System.in);
       // Taking String as an input
       System.out.println("What is  your Name ?");
       String name=scanner.nextLine();
       System.out.println("Hello "+name);
        //Taking integer as an input
       System.out.println("What is your age?");
       int age=scanner.nextInt();
       System.out.println("Your age is "+age);
       //Taking double as an input
       System.out.println("What is your monthly salary ?");
       double salary=scanner.nextDouble();
       System.out.println("You monthly salary is "+salary);
       scanner.close();
    }
    
}
