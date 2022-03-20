package leetCode.sorting;

import java.util.Arrays;

public class FindMissingPositiveInteger {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 &&nums[i]!=nums[nums[i-1]] && nums[i]<nums.length){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return 1;


    }
}
