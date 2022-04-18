package leetCode.search;

public class Shippackages {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int totalWeight=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            totalWeight+=weights[i];
            max=Math.max(max,weights[i]);
        }

        if(days==weights.length){
            return max;
        }

        int start=max;
        int end=totalWeight;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isWeightLessOrEqual(weights,mid,days)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    public boolean isWeightLessOrEqual(int[] weights,int maxCapacity,int days){
        int day=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){

        }


    }
}
