package leetCode.array;

public class MinimumChips {
    public int minCostToMoveChips(int[] position) {
        int even=0; int odd=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println(even +" "+odd);

        return Math.min(even,odd);

    }
}
