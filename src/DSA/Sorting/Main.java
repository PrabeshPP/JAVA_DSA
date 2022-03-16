package DSA.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        BubbleSort bubbleSort=new BubbleSort();
//        int[] newArr=bubbleSort.bubbleSort(arr);
//        System.out.println(Arrays.toString(newArr));

//        SelectionSort selectionSort=new SelectionSort();
//        int[] resultArr=selectionSort.selectionSort(arr);
//        System.out.println(Arrays.toString(resultArr));


//        InsertionSort insertionSort=new InsertionSort();
//        int[] resultArr=insertionSort.insertionsort(arr);
//        System.out.println(Arrays.toString(resultArr));


        //CyclicSort Algorithm
        CyclicSort cyclicSort=new CyclicSort();
        int[] resultantArr=cyclicSort.cyclicSort(arr);
        System.out.println(Arrays.toString(resultantArr));


    }



}
