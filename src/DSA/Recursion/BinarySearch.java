package DSA.Recursion;

public class BinarySearch {
    //Binary Search Using Recursion in Java
    //Divide and Conquer Relation
    int search(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
        //Body of the Function
        int mid=start+(end-start)/2;

        if(arr[mid]==target){

            return mid;
        }
        if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }

            return search(arr,target,start+1,end);

    }

}
