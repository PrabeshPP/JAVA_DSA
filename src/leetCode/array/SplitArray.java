package leetCode.array;

import java.util.Arrays;

public class SplitArray {

    int findMaxSumofSplitArray(int[] arr,int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;++i){
            start= Math.max(start,arr[i]);
            end +=arr[i];
        }

        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int arrayNumber=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    arrayNumber ++;
                }else{
                    sum+=num;
                }
            }

            if(arrayNumber>m){
                start=mid+1;
            }else{
                end=mid;
            }


        }

        return start;
    }
}
