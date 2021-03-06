package DSA.Searching.BinarySearch;

public class Ceil {
    int findCeil(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=end-1;
            }
        }
        return nums[start];
    }
}
