package leetCode.search;

import java.util.Arrays;

public class PeakElementII {
   public int[] findPeakGrid(int[][] mat) {
        int[] arr=new int[2];
            for(int i=0;i<mat.length;i++){
                int peak=peakPoint(i,mat);
                if(i==0){
                    if(mat[i][peak]>mat[i+1][peak]){
                        return new int[]{i,peak};
                    }
                }else if(i==mat.length-1){
                    if(mat[i][peak]>mat[i-1][peak]){
                        return new int[]{i,peak};
                    }
                }else{
                    if(mat[ i][peak]>mat[i-1][peak]&&mat[i][peak]>mat[i+1][peak]){
                        return new int[]{i,peak};
                    }
                }


            }

        return arr;

    }

    int peakPoint(int i,int[][] mat){
        int max=0;
        int maxIndex=0;
        for(int j=0;j<mat[i].length;j++){
            if(mat[i][j]>max){
                max=mat[i][j];
                maxIndex=j;
            }
        }
        return maxIndex;

    }
}
