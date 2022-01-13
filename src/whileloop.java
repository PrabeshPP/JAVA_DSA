import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=" ";

        //Using while loop to check whether the name is blank or not!
        while(name.isBlank()){
            System.out.println("Enter your name again :");
            name=scanner.nextLine();

        }
        System.out.println("Your Name is " +name);
        scanner.close();
    }
    
}
