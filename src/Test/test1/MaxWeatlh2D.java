package Test.test1;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        int result=mySqrt(2147395599);
        System.out.println(result);
    }


    public static int mySqrt(int x) {
        long start=0;
        long end=x-1;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return (int)end;
    }
}