package leetCode;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm should be used

        int maxSum=0;
        for(int i=0;i<nums.length;i++){
            maxSum+=nums[i];
        }



        return  maxSum;
    }
}
