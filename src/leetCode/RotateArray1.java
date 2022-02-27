package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray1 {
    public void rotate(int[] nums, int k) {
       int[] newArr=new int[nums.length];
       for(int i=0;i<k;i++){
           newArr[k-1-i]=nums[nums.length-1-i];
       }

       for(int i=0;i<nums.length-k;i++){
           newArr[i+k]=nums[i];

       }
       System.out.println(Arrays.toString(newArr));
    }
}
