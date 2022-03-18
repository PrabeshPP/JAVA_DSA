package leetCode.sorting;

import java.util.Arrays;

public class DuplicateNumber {
    //Since the elements of the array range from 1 to N,Cyclic Sort would be the perfect algorithm for the problem.
    public int findDuplicate(int[] nums) {
        int number=-1;
        //
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }else {
                i++;
            }
        }

       for(int j=0;j<nums.length;j++){
           if(j+1!=nums[j]){
               return nums[j];
           }

       }
        return number;

    }
}
