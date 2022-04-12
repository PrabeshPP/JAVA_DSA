package leetCode.search;

public class PeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr=new int[2];
            for(int i=0;i<mat.length;i++){
                int peak=peakPoint(i,mat);
                if(i==0 && peak==0){


                }

            }

        return arr;

    }

    int peakPoint(int i,int[][] mat){
        int start=0;
        int end=mat[i].length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mat[i][mid]>mat[i][mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }

        return start;

    }
}
