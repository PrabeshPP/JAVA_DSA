package leetCode.search;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int s=0;
        if(nums[0]>target){
            return 0;
        }else if(nums[nums.length-1]<target){
            return nums.length;
        }else{

            int e=nums.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(nums[m]==target){
                    return  m;
                }else if(target>nums[m]){
                    s=m+1;
                }else{
                    e=m-1;
                }

            }
        }


       index=s;
        return index;

    }
}
