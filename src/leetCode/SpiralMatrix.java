package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int i=0;
        int totalElem= matrix.length*matrix[i].length;
        int row=0;
        int col=0;
        while(i<totalElem){
            if(col==matrix[i].length-1){
               row++;
            } else if(row== matrix.length-1){
                col--;
            }else if(row<0&& col==0){
                col--;
            }
            list.add(row,col);



        }

        return  list;
    }
}
