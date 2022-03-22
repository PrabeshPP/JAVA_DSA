package leetCode.search;

public class SearchRotatedArrayII {
    public boolean search(int[] nums, int target) {

        int result=searchPivotIndex(nums);
        System.out.println(result);
        return false;
    }

    int searchPivotIndex(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(mid>0 && nums[mid]<nums[mid-1]){
               return mid;
           }

           if(nums[start]>nums[mid]){
               end=mid-1;
           }else{
               start=end;
           }

        }

        return -1;
    }
}
