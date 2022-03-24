package leetCode.search;

public class MinRotatedArray {
    //100% faster than other solutions
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }else if(nums[0]>nums[nums.length-1]){
            return nums[nums.length-1];
        }
        int pivotIndex=pivotPoint(nums);



        return nums[pivotIndex+1];
    }

    int pivotPoint(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return  mid;
            }
            if( mid>start && nums[mid]<nums[mid-1] ){
                return mid-1;
            }

            if(nums[start]>=nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }


        return -1;
    }
}
