package leetCode.search;

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowerBound=0;
        int upperBound=matrix[0].length-1;


        while(lowerBound< matrix.length && upperBound>=0){
            if(matrix[lowerBound][upperBound]==target){
                return  true;
            }else if(matrix[lowerBound][upperBound]>target){
                upperBound--;
            }else {
                lowerBound++;

            }
        }
        return false;
    }

}
