package leetCode.array;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int currentElem=nums[i];
            int counter=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==currentElem){
                    counter++;
                }

            }
            if(counter==1){
                return currentElem;
            }
        }
        return -1;
    }
}
