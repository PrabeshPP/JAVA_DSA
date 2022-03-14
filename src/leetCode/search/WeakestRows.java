package leetCode.search;

import java.util.Arrays;

public class WeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int index=binarySearch(mat,i,mat[i].length-1);
                result[i]=index;
        }

       System.out.println(Arrays.toString(result));

        return Arrays.copyOfRange(result,0,k);
    }

    int binarySearch(int[][] mat,int row,int end){
        int start=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mat[row][mid]==1){
                start=mid+1;
            }else if(mat[row][mid]==0){
                end=mid-1;
            }

        }
        return start;
    }
}
