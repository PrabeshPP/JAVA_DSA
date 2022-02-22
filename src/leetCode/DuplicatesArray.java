package leetCode;

public class DuplicatesArray {
    public int removeDuplicates(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=-101;
                }

            }
        }

        for(int i=0;i<nums.length;i++){
            if(i!=-101){
                len++;
            }
        }
    return len;
    }
}
