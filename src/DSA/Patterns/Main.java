package DSA.Patterns;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
