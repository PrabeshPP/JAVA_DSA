package leetCode.sorting;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i!=nums[i]){
                int temp=nums[i];
                if(nums[i]>nums.length-1){
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }
                nums[i]=nums[temp-1];
            }else{
                i++;
            }
        }

        int missingNumber=nums.length;
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                missingNumber=j;
            }
        }
        return missingNumber;
    }

}
