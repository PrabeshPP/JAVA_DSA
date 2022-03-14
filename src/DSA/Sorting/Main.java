package DSA.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={22,5,1,18,10,99,60};
//        BubbleSort bubbleSort=new BubbleSort();
//        int[] newArr=bubbleSort.bubbleSort(arr);
//        System.out.println(Arrays.toString(newArr));

//        SelectionSort selectionSort=new SelectionSort();
//        int[] resultArr=selectionSort.selectionSort(arr);
//        System.out.println(Arrays.toString(resultArr));


        InsertionSort insertionSort=new InsertionSort();
        int[] resultArr=insertionSort.insertionsort(arr);
        System.out.println();
    }



}
