package leetCode.array;
//completed
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix=new int[matrix[0].length][matrix.length];

    for(int i=0;i< matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){

            int result=matrix[i][j];
            newMatrix[j][i]=result;
        }
    }


        return newMatrix;

    }
}
