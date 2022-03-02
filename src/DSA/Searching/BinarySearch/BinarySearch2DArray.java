package DSA.Searching.BinarySearch;

public class BinarySearch2DArray {
    int[] binarySearch2DArray(int[][] matrix,int target){
        int[] pos={-1,-1};
        int lowerBound  = 0;
        int upperBound  = matrix[0].length-1;

        while(lowerBound<matrix.length && upperBound>=0){
            if(matrix[lowerBound][upperBound]==target){
                    pos[0]=lowerBound;
                    pos[1]=upperBound;

                    return  pos;
            }else if(matrix[lowerBound][upperBound]>target){
                // since the target is bigger,we have move down ;
                upperBound--;
            }else{
                // since the target is smaller,we have to move left to search small value
                lowerBound++;
            }

        }

        return pos;

    }
}
