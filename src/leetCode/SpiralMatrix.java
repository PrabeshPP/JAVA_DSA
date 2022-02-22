package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        // We should use for pointers inorder to traverse in 2-D array in a spiral way.
        int top=0,down=matrix[0].length-1,left=0,right=matrix[0].length-1;
        int direction=0;
        // if direction is 0 go from left to right
        // if  direction is 1 go from top to down
        // if direction is 2 go from right to left
        // if direction is 3 go from down to  top

        while(top<=down && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                   list.add(matrix[top][i]);

                }
                top++;
            }else if(direction==1){
                for(int i=top;i<=down;i++){
                    list.add(matrix[i][right]);


                }
                right--;
            }else if(direction==2){
                for(int i=right;i>=left;i--){
//                    list.add((matrix[down][i]));

                    System.out.print(matrix[down][i]+",");

                }
                down--;
            }else if(direction==3){
                for(int i=down;i<=top;i++){
//                    list.add(matrix[i][left]);
                    System.out.print(matrix[i][left]+",");
                }
                left++;
            }

            direction=(direction+1)%4;
        }
        return  list;
    }
}
