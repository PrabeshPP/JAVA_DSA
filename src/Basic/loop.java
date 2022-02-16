package Basic;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("This is a program to display the multiplication table of given number :)");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of whhich you want to display the multiplication table :");
        int number=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i +"*"+8 +"=" +(i*number));
        }
        scanner.close();

        for(int i=0;i<4;++i){
            System.out.println();
            for(int j=0;j<4;++j){
                System.out.print("*");
            }
           
        }
        
    }
    
}
