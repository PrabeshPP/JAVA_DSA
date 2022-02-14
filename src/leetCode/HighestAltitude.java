package leetCode;

import java.util.Arrays;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];

        int b=0;

        for(int i=1;i<gain.length;i++){
            b=gain[i]+arr[i];
            arr[i+1]=b;


        }


        int highest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }

        return  highest;
    }
}
