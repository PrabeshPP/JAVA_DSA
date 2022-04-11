package Test.test1;

public class MaxWeatlh2D {
    public static void main(String[] args) {
        int[][] nums = {
                {1,4,6},
                {1,2,3}
        };
        System.out.println(wealth(nums));

    }
    static int wealth(int[][] nums){

        int maxSum = 0;

        for(int rol = 0; rol < nums.length; rol++) {
            int sum = 0;
            for (int col = 0; col < nums[rol].length; col++){
                sum += nums[rol][col];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}