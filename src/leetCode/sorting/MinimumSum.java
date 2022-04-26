package leetCode.sorting;

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        int result=minimumSum(4009);

    }

    public static  int minimumSum(int num) {
            int[] arr=new int[4];
            int i=0;
            while(num>0){
                arr[i]=num%10;
                num=num/10;
                i++;
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            return 1;
    }
}
