package leetCode.sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr=new int[]{2,2,1,1,1,2,2};
        int result=majorityElement(arr);



    }
    static int majorityElement(int[] nums) {
        int[] arr=sort(nums);
        int maxElem=0;


    return 1;
    }

   static int[] sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else{
                    break;
                }


            }

        }

        return nums;
    }
}


