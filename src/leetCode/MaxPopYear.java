package leetCode;

import java.util.ArrayList;

public class MaxPopYear {
    public int maximumPopulation(int[][] logs) {
        int arr[]=new int[101];

        for(int[] arr1:logs){
            int birthIndex=arr1[0]-1950;
            int deathIndex=arr1[1]-1950;

            arr[birthIndex]++;
            arr[deathIndex]--;
        }
        int maxValue=arr[0];
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }

        }

    }
}
