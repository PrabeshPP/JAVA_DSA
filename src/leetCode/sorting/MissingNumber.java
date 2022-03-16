package leetCode.sorting;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i<nums.length){
            if(nums[i]!=nums.length && i!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;




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
