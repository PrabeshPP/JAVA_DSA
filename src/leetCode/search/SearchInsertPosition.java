package leetCode.search;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        if(nums[0]>target){
            return 0;
        }else if(nums[nums.length-1]<target){
            return nums.length;
        }else{
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int m=s+(e-s)/2;

            }
        }



        return index;

    }
}
