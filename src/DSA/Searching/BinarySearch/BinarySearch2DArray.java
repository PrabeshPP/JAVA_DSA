package DSA.Searching.BinarySearch;

public class BinarySearch2DArray {
    int[] binarySearch2DArray(int[][] matrix,int target){
        int[] pos=new int[2];
        int lowerBound  = 0;
        int upperBound  = matrix[0].length;

        while(lowerBound<matrix.length && upperBound>=0){
            if(matrix[lowerBound][upperBound]==target){
                    pos[0]=lowerBound;
                    pos[1]=upperBound;
            }else if(matrix[lowerBound][upperBound]>target){
                // since the target is bigger,we have move down ;
                lowerBound++;
            }else{
                // since the target is smaller,we have to move left to search small value
                upperBound--;
            }

        }

        return pos;

    }
}
