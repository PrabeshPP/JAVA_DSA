package DSA.Searching.BinarySearch;

public class MountainArray {

    // Finding the index of the peak in a Mountain Array.
    int findIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //[0,1,0]
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] ){
               end=mid;

            }else{
                start=mid+1;
            }
        }

        return  start;

    }
}
