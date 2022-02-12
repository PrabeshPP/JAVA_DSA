package leetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<Boolean>();
        int maxCandies=findMaxCandies(candies);
        for(int i=0;i<candies.length;++i){
            if(candies[i]+extraCandies>=maxCandies){
                result.add(i,true);

            }else{
                result.add(i,false);
            }
        }

        return result;


    }

    int findMaxCandies(int[] cand){
        int max=cand[0];
        int n=1;
        while(n<cand.length){
            if(cand[n]>max){
                max=cand[n];
            }
            ++n;
        }

        return max;
    }
}
