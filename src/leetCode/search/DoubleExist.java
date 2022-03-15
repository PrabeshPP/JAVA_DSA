package leetCode.search;

import java.util.Arrays;

public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
        boolean exist=false;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int result=binarySearch(arr,i);
            System.out.println(result);

        }

        return exist;
    }

    int binarySearch(int[] arr,int currentIndex){
        int start=0;
        int end=arr.length-1;
        int target=arr[currentIndex]*2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==currentIndex){
                continue;
            }else{
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }

        return -1;
    }
}
