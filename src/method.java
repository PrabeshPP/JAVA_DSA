import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        
        // metohod= a block of code that is executed whenever it is called;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi there! Enter your first name :");
        String name=scanner.next();
        String print=hello(name);
        System.out.println(print);
        scanner.close();

    }

    static String hello(String name){
       return "Hello "+name+",Welcome to the programming world!";
    }
    
}
