import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        //Finding the hypotenuse of Triangle
        double p,b,h;
        System.out.println("Hello User! This program was created to find the hypotenuse of the triangle");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the base of triangle :");
        b=scanner.nextDouble();
        System.out.println("Enter the the length of the perpendicualr of triangle :");
        p=scanner.nextDouble();
        h=Math.sqrt(Math.pow(b, 2)+Math.pow(p, 2));
        System.out.println("The length of the hypotenuse of the triangle is "+h);
        scanner.close();
    }
    
}
