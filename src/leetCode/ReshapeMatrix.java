package leetCode;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int maxElem=mat.length*mat[0].length;
        int x1=0;
        int y1=0;
        if(maxElem!=r*c){
            return mat;
        }
        else{
            int[][] newMat=new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    newMat[x1][y1]=mat[i][j];
                    y1++;
                    if(y1==c){
                        y1=0;
                        x1++;
                    }

                }
            }
        return  newMat;

        }

    }

}
