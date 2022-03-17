package leetCode.search;
///
public class SpecialArray {
    public int specialArray(int[] nums) {
        int x=0;

        for (int i=0;i<=nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[j]>=i){
                    x++;
                }
            }

            if(x!=i){
                x=0;
            }else{
                return x;
            }


        }

        return -1;

    }


}
