package leetCode.search;

public class MinRotatedArrayII {
    public int findMin(int[] nums) {
        System.out.println(pivotPoint(nums));
        return nums[pivotPoint(nums)+1];



    }

    int pivotPoint(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(mid<end && nums[mid+1]<nums[mid]){
                return  mid;

            }

            if(nums[start]==nums[mid]){
                start=mid+1;
            }

            if(nums[start]<nums[mid]){
                start=mid+1;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
        }

        return -1;

    }
}
