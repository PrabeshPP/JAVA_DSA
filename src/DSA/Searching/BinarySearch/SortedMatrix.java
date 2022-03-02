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

    static  int[] search(int[][] matrix,int row,int colStart,int colEnd,int target){
        while(colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return  new int[]{row,mid};
            }else if(matrix[row][mid]<target){
                colStart=mid+1;

            }else{
                colEnd=mid-1;
            }
        }

        return  new int[]{-1,-1};
    };

    static  int[] searchMatrix(int[][] matrix,int target){
        int[] pos=new int[2];
        int rows= matrix.length;
        int column=matrix[0].length;
        int rStart=0;
        int rEnd=matrix.length-1;
        if(rows==1){
           pos= search(matrix,0,0,2,target);
           return pos;
        }

        while (rStart<=rEnd){

        }

        return new int[] {-1,-1};
    }

}
