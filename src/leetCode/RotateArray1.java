package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray1 {
    public void rotate(int[] nums, int k) {
       int[] newArr=new int[nums.length];
       for(int i=0;i<k;k++){
           newArr[k-1-i]=nums[nums.length-1-i];
       }
       System.out.println(Arrays.toString(newArr));
    }
}
