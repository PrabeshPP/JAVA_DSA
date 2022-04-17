package leetCode.sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3};
        int result = majorityElement(arr);
        System.out.println(result);


    }

    static int majorityElement(int[] nums) {
        nums = sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxElem = 0;
        int maxCount = 0;
        int start = 0;
        int counter = 0;
        while (start <= nums.length - 1){
            int elem = nums[start];
            for (int j = start + 1; j < nums.length; j++) {
                if (elem == nums[j]) {
                    counter++;
                    start++;
                } else {
                    start = j;
                    break;

                }

            }
            System.out.println(start);
            if (counter > maxCount) {
                maxCount = counter;
                maxElem = elem;

            }
            start++;

        }



    return maxElem;
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


