package leetCode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;

            }else{
                i++;
            }
        }

       for(int j=0;j<nums.length;j++){
           if(j+1!=nums[j]){
               list.add(j+1);
           }
       }


        return  list;
    }
}
