package leetCode.search;

public class MinimumSize {
    public static void main(String[] args) {
        int[] arr={1,4,4};
        int target=4;
        int len=minSubArrayLen(target,arr);
        System.out.println(len);

    }

    static int minSubArrayLen(int target, int[] nums) {
        int size=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int total=0;
        while(right<nums.length){
            total+=nums[right];
            if(total>=target){
               while(total>=target){
                   total-=nums[left];
                   left++;

               }
                size=Integer.min(size,right-left+2);
            }
                right++;



        }


        if(size==Integer.MAX_VALUE){
            return 0;
        }
        return size;

    }

}


