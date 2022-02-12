package leetCode;

public class SmallArray {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int sm=0;
            for(int j=i+1;j<nums.length;j++){
                if(num1>nums[j]){
                    sm++;
                }

            }
            result[i]=sm;
        }



        return  result;

    }
}
