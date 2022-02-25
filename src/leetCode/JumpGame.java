package leetCode;

public class JumpGame {
    public boolean canJump(int[] nums) {

        int n=nums.length-1;
        int reachable=0;
        for(int i=0;i<n;i++){
            if(reachable<i){
                return false;
            }
            reachable=Math.max(reachable,nums[i]+i);

        }


        return true;
    }
}
