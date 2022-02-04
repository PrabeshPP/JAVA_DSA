package DSA.Searching.BinarySearch;

public class Floor {
    int findFloor(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return nums[mid];

            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return nums[end];
    }
}
