package leetCode;

public class MinimumChips {
    public int minCostToMoveChips(int[] position) {
        int even=0; int odd=0;
        for(int i=0;i<position.length;i++){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }


        return Math.min(even,odd);

    }
}
