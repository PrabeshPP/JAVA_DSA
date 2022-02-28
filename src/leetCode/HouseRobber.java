package leetCode;

public class HouseRobber {
    public int rob(int[] nums) {
        int maxValue=0;
        int value1=0;
        int value2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                value1+=nums[i];
            }else{
                value2+=nums[i];
            }
        }

        if(value1>value2){
            maxValue=value1;
        }else{
            maxValue=value2;
        }


        return maxValue;

    }


}
