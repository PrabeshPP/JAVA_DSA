package leetCode.search;

public class MinimumSize {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        int len=minSubArrayLen(target,arr);

    }

    static int minSubArrayLen(int target, int[] nums) {
        int size=0;
        int left=0;
        int right=0;
        int total=0;
        while(left<=right){
            for(int i=0;i<right;i++){
                total+=nums[right];
            }

            if(total>=target){
                size=right+1;
                left++;
            }

            right++;
        }
        System.out.println(size);

        return size;

    }

}


