package DSA.Searching.BinarySearch;

public class OrderAgnoisticBinarySearch {
    int findIndex(int[]arr,int target){
        int start=0;
        int last=arr.length-1;
        if(arr[start]<arr[last]){
            while(start<=last){
                int mid=(start+last)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }else if(target<arr[mid]){
                    last=mid-1;
                }else{
                    return mid;
                }
            }
        }else{
            while(start<=last){
                int mid=(start+last)/2;
                if(target>arr[mid]){
                    last=mid+1;
                }else if(target<arr[mid]){
                    start=mid-1;
                }else{
                    return mid;
                }
            }

        }
        return -1;

    }
}
