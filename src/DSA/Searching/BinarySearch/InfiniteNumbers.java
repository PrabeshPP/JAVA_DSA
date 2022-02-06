package DSA.Searching.BinarySearch;

public class InfiniteNumbers {

    int findAns(int[] nums,int target){
        //
        int start=0;
        int end=1;

        //conditional loops
        while(target>nums[end]){
         int   newStart=end+1;
         end=end+(end-start+1)*2;
         start=newStart;
        }
        int index=binarySearch(nums,target,start,end);

        return index;



    }



    int binarySearch(int[] nums,int target,int start1,int end1){
        int len=1;
        int start=start1;
        int end=end1;


            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return  -1;

        }

    }


