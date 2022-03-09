package leetCode.search;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int firstRow=0;
        int lastRow=matrix.length-1;
        int midCol=(matrix[0].length-1)/2;
        if(matrix.length==1){
           return binarySearch(matrix,0,0,matrix[0].length-1,target);

        }
        while(firstRow<lastRow-1){
            int midRow=firstRow+(lastRow-firstRow)/2;
            if(matrix[midRow][midCol]==target){
                return true;
            }else if(matrix[midRow][midCol]>target){
                lastRow--;
            }else{
                firstRow++;

            }

        }


        if(matrix[firstRow][midCol]==target){
            return true;
        }

        if(target<=matrix[firstRow][midCol]){
            return binarySearch(matrix,firstRow,0,midCol,target);
        }

        if(target>matrix[firstRow][midCol] && target<=matrix[firstRow][matrix[0].length-1]){

            return  binarySearch(matrix,firstRow,midCol+1,matrix[0].length-1,target);
        }

        if(target<=matrix[lastRow][midCol]){
            return  binarySearch(matrix,lastRow,0,midCol,target);
        }

        if(target>matrix[lastRow][midCol]){
            return  binarySearch(matrix,lastRow,midCol+1,matrix[0].length-1,target);
        }




        return false;

    }

   boolean binarySearch(int[][] arr,int row,int first,int last,int target){
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[row][mid]==target){
                return true;
            }else if(arr[row][mid]>target){
                last--;
            }else{
                first++;
            }
        }
        return false;
    }
}
