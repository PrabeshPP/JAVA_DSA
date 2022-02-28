package leetCode;

public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        if(nums.length==2){
            return Math.max(nums[0],nums[1] );
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1] );
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i] );

        }

        return  dp[nums.length-1];

    }


}
