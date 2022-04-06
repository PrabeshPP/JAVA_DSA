package DSA.Recursion;

public class Main {
    public static void main(String[] args) {
        //write a function that prints hello world
        message(5);

    }

    static void message(int times){
        if(times==0){
            return;
        }
        System.out.println("Hello World!");
        message(times-1);
    }
}
