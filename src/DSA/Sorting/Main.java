package DSA.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={22,5,1,18,10,99,60};
        BubbleSort bubbleSort=new BubbleSort();
        int[] newArr=bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(newArr));

    }



}
