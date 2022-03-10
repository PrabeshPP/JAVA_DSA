package leetCode.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArrayII {
    public int[] intersection(int[] nums1, int[] nums2) {
      int length1=nums1.length;
      int length2=nums2.length;
      int[] arr=new int[length1*length2];
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0,k=0;
      while(i<length1 && j <length2){
          if(nums1[i]<nums2[j]){
              i++;
          }else if(nums1[i]>nums2[j]){
              j++;
          }else{
            arr[k]=nums1[i];
            i++;
            j++;
            k++;

          }


      }
      return Arrays.copyOfRange(arr,0,k);
    }
}
