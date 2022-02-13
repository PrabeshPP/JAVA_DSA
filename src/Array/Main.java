package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // Array declaration
//        int[] arr;
        // Array initialization , the object is store in the heap(memory)
        //Array of Primitives
//       int[] arr={1,2,3,4,5};


        // It will convert array to string
//        System.out.print(Arrays.toString(arr));

        // Array of an Objects;
        // Since String is a non-primitive type,we can use it for the array objects
        String[] str=new String[4];

        for(int i=0;i<str.length;++i){
            str[i]=scanner.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
