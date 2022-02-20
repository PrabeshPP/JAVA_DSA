package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li=new ArrayList<Integer>();
        int luckyNumber=0;
        int minRow=1000000;


        int column=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(minRow>matrix[i][j]){
                    minRow=matrix[i][j];
                    column=j;

//

                }



            }



            int maxColumn=-1;
            for(int k=0;k< matrix.length;k++){

                if(k==i){
                    continue;
                }else{
                    if(maxColumn<matrix[k][column] ){

                        maxColumn=matrix[k][column];

                    }
                }



//
            }

            if(maxColumn==minRow){
                li.add(maxColumn);
            }

            minRow=1000000;

        }





        return li;
    }
}
