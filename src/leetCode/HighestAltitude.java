package leetCode;

import java.util.Arrays;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];
        System.out.println(gain[1]);
        int b=0;

        for(int i=2;i<arr.length;i++){
            if(i<= gain.length){

            }

        }


        int highest=gain[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }

        return  highest;
    }
}
