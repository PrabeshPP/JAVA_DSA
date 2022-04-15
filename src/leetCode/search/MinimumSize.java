package leetCode.search;

public class MinimumSize {
    public static void main(String[] args) {
        int[] arr={1,4,4};
        int target=4;
        int len=minSubArrayLen(target,arr);

    }

    static int minSubArrayLen(int target, int[] nums) {
        int size=0;
        int left=0;
        int right=0;
        int total=0;
        while(left<=right && right<nums.length-1){
            for(int i=0;i<right;i++){
                total+=nums[right];
            }

            if(total>=target){
                total=total-nums[left];
                size=(right-left)+2;
                left++;
            }else{
                right++;
            }


        }
        System.out.println(size);

        return size;

    }

}


