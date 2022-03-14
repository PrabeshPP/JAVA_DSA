package leetCode.search;

import java.util.Arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }

        for(int i=0;i< bobSizes.length;i++){
            sum2+=bobSizes[i];
        }

        System.out.println(sum1+" "+sum2);
        return new int[]{0,1};





    }
}
