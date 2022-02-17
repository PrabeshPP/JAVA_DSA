package leetCode;

import java.util.Arrays;

public class FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean result=false;
        int maxRotate=4;

        int[][] arr1=rotate(mat);






        return result;
    }

    public int[][] rotate(int[][] arr){
        int[][] newArr=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                newArr[j][arr.length-1-i]=arr[i][j];
            }
        }
        return  newArr;
    }
}
