package DSA.Searching.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class SearchRange {
    int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        int index1=search(nums,target,true);
        int index2=search(nums,target,false);
        ans[0]=index1;
        ans[1]=index2;

        return ans;

    }

    int search(int[] nums,int target,boolean isFirstIndex){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        int[] list=new int[2];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=start+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                index=mid;
                if(isFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return index;
    }
}
