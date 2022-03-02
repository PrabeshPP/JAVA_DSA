package DSA.Searching.BinarySearch;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        BinarySearch2DArray binarySearch2DArray=new BinarySearch2DArray();
        int[] pos=binarySearch2DArray.binarySearch2DArray(arr,1);
        System.out.println(Arrays.toString(pos));

    }
}
