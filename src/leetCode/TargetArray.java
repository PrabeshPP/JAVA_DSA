package leetCode;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
//            System.out.print(index[i]+",");
            System.out.print(nums[i]+",");
            target[i]=nums[index[i]];
        }



        return target;

    }
}
