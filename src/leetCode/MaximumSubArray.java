package leetCode;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm should be used

        int maxSum=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }

            if(currSum<0){
                currSum=0;
            }
        }



        return  maxSum;
    }
}
