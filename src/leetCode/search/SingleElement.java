package leetCode.search;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        //Edge Case
        if(nums.length==1){
            return nums[0];
        }

        //Boundary Check
        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int result =binarySearch(nums);

        return result;
    }

    int binarySearch(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 &&nums[mid]==nums[mid-1]){
                if(mid%2==1){
                    start=mid+1;
                }else{
                    end=mid-2;
                }
            }else if(mid<nums.length && nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    start=mid+2;
                }else{
                    end=mid-1;
                }
            }else{
                return nums[mid];
            }
        }

        return -1;
    }
}
