package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li=new ArrayList<Integer>();
        int luckyNumber=0;
        int minRow=matrix[0][0];
        int column=0;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix.length;j++){
                if(minRow>matrix[i][j]){
                    minRow=matrix[i][j];
                    column=j;
                }

            }
            for(int k=0;k< matrix.length;k++){
                if(minRow>matrix[k][column]){
                    luckyNumber=minRow;
                }
            }
        }

        System.out.print(luckyNumber);

        return li;
    }
}
