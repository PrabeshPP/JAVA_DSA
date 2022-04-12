package leetCode.search;

public class PeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr=new int[2];
            for(int i=0;i<mat.length;i++){
                int peak=peakPoint(i,mat);
                if(i==0){
                    if(peak==0 && mat[i][peak]>mat[i][peak+1] && mat[i][peak]>mat[i+1][peak]){
                            return new int[]{i,peak};
                    }

                    if(peak==mat[i].length-1 && mat[i][peak]>mat[i][peak-1] && mat[i][peak]>mat[i+1][peak]){
                        return  new int[]{i,peak};
                    }

                    if(mat[i][peak]>mat[i][peak-1] && mat[i][peak]>mat[i+1][peak] && mat[i][peak]>mat[i][peak+1]){
                        return new int[]{i,peak};
                    }

                }

                if(i==mat.length-1){
                    if(peak==0 && mat[i][peak]>mat[i][peak+1] && mat[i][peak]>mat[i-1][peak]){
                        return new int[]{i,peak};
                    }

                    if(peak==mat[i].length && mat[i][peak]>mat[i][peak-1] && mat[i][peak]>mat[i-1][peak]){
                        return  new int[]{i,peak};
                    }

                    if(mat[i][peak]>mat[i][peak-1] && mat[i][peak]>mat[i-1][peak] && mat[i][peak]>mat[i][peak+1]){
                        return new int[]{i,peak};
                    }

                }

                if(peak==0){
                    if(mat[i][peak]>mat[i][peak+1] && mat[i][peak]>mat[i-1][peak] && mat[i][peak]>mat[i+1][peak]){
                        return new int[]{i,peak};
                    }
                }

                if(peak==mat[i].length-1){

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
