package DSA.Searching.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] pos=searchMatrix(matrix,3);
        System.out.println(Arrays.toString(pos));

    }

    static  int[] searchMatrix(int[][] matrix,int target){
        int rows= matrix.length;
        int column=matrix[0].length;

    }

}
