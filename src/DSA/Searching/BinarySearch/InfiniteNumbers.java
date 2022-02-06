package DSA.Searching.BinarySearch;

public class InfiniteNumbers {
    int findNumberInfinite(int[] nums,int target){
        int start=nums[0];
        int end=nums[4];
        if(end>target) {
            int mid = start + (end - start) / 2;
            while (start <= end) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
    }

}
