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

        int difference=(sum1-sum2)/2;


        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j< bobSizes.length;j++){
                if(aliceSizes[i]-bobSizes[j]==difference){
                    return new int[]{aliceSizes[i],bobSizes[j]};

                }
            }
        }



        return new int[]{-1,-1};

    }


}
