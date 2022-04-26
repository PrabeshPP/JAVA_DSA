package leetCode.sorting;

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        int result=minimumSum(4009);
        System.out.println(result);

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

            return arr[0]*10+arr[3]+arr[1]*10+arr[2];
    }
}
