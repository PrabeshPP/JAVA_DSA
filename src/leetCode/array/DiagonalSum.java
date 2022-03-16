package leetCode.array;

public class DiagonalSum {
    //Completed
    public int diagonalSum(int[][] mat) {
        int sum=0;
        //First diagonal Sum
        for(int i=0;i<mat.length;i++){
            int value=mat[i][i];
            sum+=value;
        }



        if(mat.length %2==0){
            for(int i=0;i<mat.length;i++){
                int value=mat[i][mat.length-1-i];
                sum+=value;
            }

        }else{
            for(int i=0;i<mat.length;i++){
                if(i== mat.length/2){
                    continue;

                }
                int value=mat[i][mat.length-1-i];
                sum+=value;

            }
        }





        return sum;

    }
}
