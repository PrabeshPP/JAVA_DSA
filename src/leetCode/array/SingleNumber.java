package leetCode.array;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i+=2;
            }else{
                return nums[i];
            }

        }

        return nums[nums.length-1];
    }
}
