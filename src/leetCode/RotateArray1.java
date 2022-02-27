package leetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateArray1 {
    public void rotate(int[] nums, int k) {
        //This solution would work but exceeds time limit
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++){
//            list.add(nums[i] );
//        }
//
//    k=k%nums.length;
//        for(int i=0;i<k;i++){
//            list.add(0,list.get(nums.length-1));
//        }
//        for(int i=0;i< nums.length;i++){
//            nums[i]=list.get(i);
//        }


        //Soln 2,split the array into two arrays;

        k=k%nums.length;
        //reverse Part1
        reverse(nums,0, nums.length-1-k);
        //reverse Part2
        reverse(nums, nums.length-k, nums.length-1);

        //reverse  All
        reverse(nums,0, nums.length-1);

        System.out.println(Arrays.toString(nums));



    }

    public void reverse(int[] num,int length1,int length2){
        int li=length1;
        int ri=length2;

        while(li<ri){
            int temp=num[li];
             num[li]=num[ri];
             num[ri]=temp;
             li++;
             ri--;

        }
    }
}
