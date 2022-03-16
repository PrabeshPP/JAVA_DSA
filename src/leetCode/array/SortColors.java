package leetCode.array;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        //I have used Bubble Sorting which can be lengthy to sort the array
        //Will come up with different solution after learning sorting tutorial
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
