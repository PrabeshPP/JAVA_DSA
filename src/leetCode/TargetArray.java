package leetCode;

import java.awt.*;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ind=index[i];
            if(ind<i){
                for(int j=ind;j<nums.length-1;j++){
                    target[j+1]=target[j];
                }

            }else{
                target[ind]=nums[i];
            }


        }



        return target;

    }
}
