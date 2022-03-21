package Strings;

public class Main {
    public static void main(String[] args) {
        String a="Prabesh";
        //It will create a new obj ,Out-Side of the string pool
        String b=new String("Prabesh");
        System.out.println(a==b);


    }
}
