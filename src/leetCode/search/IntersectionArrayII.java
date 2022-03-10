package leetCode.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArrayII {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            int result=binarySearch(nums2,0,nums2.length-1,nums1[i]);
            if(result!=-1){
                    System.out.println(nums1[i]);
                    list.add(nums1[i]);
                    Arrays.sort(nums2);
            }

        }

        System.out.println(Arrays.toString(list.toArray()));
        return new int[]{0,0};

    }

    int binarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                arr[mid]=-1;
                return mid;
            }else if(arr[mid]>target){
                end--;
            }else{
                start++;
            }
        }
        return -1;

    }
}
