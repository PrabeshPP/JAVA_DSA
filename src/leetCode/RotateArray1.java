package leetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray1 {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i] );
        }


        for(int i=0;i<k;i++){
            list.add(0,list.get(nums.length-1));
        }
        for(int i=0;i< nums.length;i++){
            nums[i]=list.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }
}
