package leetCode.sorting;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return arr;
    }
}
