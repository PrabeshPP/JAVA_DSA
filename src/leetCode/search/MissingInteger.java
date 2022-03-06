package leetCode.search;

import java.util.ArrayList;

public class MissingInteger {
    public int findKthPositive(int[] arr, int k) {
        int rem=arr[arr.length-1]-arr.length;
        if(rem==0){
            return arr[arr.length-1]+k;
        }else{
            int start=0;
            int end=arr.length;
            while(start<end){
                int mid=start+(end-start)/2;
               if(arr[mid]-1-mid<k){
                   start=mid+1;
               }else{
                   end=mid;
               }
            }
            return end+k;
        }

    }
}
