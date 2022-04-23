package leetCode.array;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        //transpose the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }



    }

}
