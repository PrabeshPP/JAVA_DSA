package DSA.Patterns;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Basic of Patterns in java
        pattern1(5);
//        pattern2(5);

    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
