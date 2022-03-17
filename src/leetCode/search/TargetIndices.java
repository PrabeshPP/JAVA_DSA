package leetCode.search;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    //
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        int index1=binarySearch(nums,target,true);
        int index2=binarySearch(nums,target,false);
        if(index1!=-1 || index2!=-1){
            for(int i=index1;i<=index2;i++){
                list.add(i);
            }

        }




        return list;
    }

    int binarySearch(int[] nums,int target,boolean isLeft){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                if(isLeft){
                    end=mid-1;


                }else{
                    start=mid+1;

                }
                index=mid;

            }else if(nums[mid]>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return index;
    }

}
