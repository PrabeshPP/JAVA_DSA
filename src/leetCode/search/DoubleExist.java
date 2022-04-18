package leetCode.search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
        boolean isExist=false;
        for(int i=0;i<arr.length;i++){
            int result=binarySearch(arr,arr[i]*2);
            if(result!=i && result !=-1){
                return true;
            }
        }

        return false;
    }


    public int binarySearch(int[] arr1,int target){
        int start=0;
        int end=arr1.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr1[mid]==target){
                return mid;
            }else if(target<arr1[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }


}
