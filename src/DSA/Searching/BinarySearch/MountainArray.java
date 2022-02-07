package DSA.Searching.BinarySearch;

public class MountainArray {
    int findIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        int peak=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                peak=mid;
                return  peak;

            }else  if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return  peak;

    }
}
