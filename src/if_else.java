import java.util.Scanner;

public class if_else {
    public static void main(String[]args){
        //Exploring if-else in Java.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=scanner.nextInt();
        if(age<=18){
            System.out.println("You are not a legal citizen ,yet!");

        }else if(age>=18){
            System.out.println("Your are a legal citizen,cheers!");
        }else if(age<=40){
            System.out.print("You are still young.");

        }else{
            System.out.print("Your are slowly marching towards the old age :)");
        }

        scanner.close();
        
    }
    
}
