package leetCode;

import java.util.Arrays;

public class FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean result=false;
        int maxRotate=4;







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

    public boolean check(int[][] arr,int[][] target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
