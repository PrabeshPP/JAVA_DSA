package DSA.Recursion;

public class BinarySearch {
    //Binary Search Using Recursion in Java
    //Divide and Conquer Relation
    int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            end=mid-1;
        }else{
            start=mid+1;
        }

        search(arr,target,start,end);



        return -1;
    }


}
