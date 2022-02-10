package leetCode;

public class RotatedArrayIndex() {

    int findRotateArrayIndex(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return  mid;
            }
            if( mid>start && nums[mid]<nums[mid-1] ){
                return mid-1;
            }

            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;

    }

}
