package leetCode.sorting;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>0;j--) {
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }

            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }


}
