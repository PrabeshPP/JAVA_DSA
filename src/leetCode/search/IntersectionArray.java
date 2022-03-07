package leetCode.search;

import java.util.*;

public class IntersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setList= new HashSet<Integer>();
       Arrays.sort(nums2);
       for(Integer number:nums1){
           int num=binarySearch(nums2,number);
           if(num!=-1){
               setList.add(number);
           }

       }

       int[] arr=new int[setList.size()];
       int x=0;
       for(Integer num:setList){
           arr[x]=num;
           x++;
       }

    return arr;
    }

    public int binarySearch(int[] num,int target){
        int start=0;
        int end=num.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]==target){
                return mid;
            }else if(num[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return  -1;
    }
}
