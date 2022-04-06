package DSA.Recursion;
//Recursion in Java
public class Main {
    public static void main(String[] args) {
        //write a function that prints hello world
        //Print the number from 1 to 5 using recursive method
        print(1);

    }

    static void print(int times){
        if(times==6){
            return;
        }
        System.out.println(times);
        print(times+1);
    }
}
