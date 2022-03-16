package leetCode.array;

import java.util.Arrays;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] newArr=new int[nums.length];
        int[]postFix=new int[nums.length];
        int[] preFix=new int[nums.length];
        preFix[0]=1;
        for(int i=1;i<nums.length;i++){
            preFix[i]=preFix[i-1]*nums[i-1];
        }

        postFix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            postFix[i]=postFix[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            newArr[i]=preFix[i]*postFix[i];
        }

        return newArr;
    }
}
