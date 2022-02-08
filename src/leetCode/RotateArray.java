package leetCode;

public class RotateArray {
    int search(int[] nums, int target) {
        int index=-1;
        int peakIndex=peakIndex(nums);
        System.out.println(peakIndex);
        int index1=binarySearch(nums,target,0,peakIndex);
        int index2=binarySearch(nums,target,peakIndex+1,nums.length-1);

        if(index1==-1 && index2==-1){
            return  -1;
        }else{
            if(index1>0 &&index2<0){
                return  index1;
            }else{
                return  index2;
            }
        }




    }

    int pivotIndex(int[] nums){

    }

    int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return  mid;
            }else if(nums[mid]>target){
                    end=mid-1;

                }else{
                    start=mid+1;
                }



        }
        return -1;

    }

}
