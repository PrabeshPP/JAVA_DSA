package leetCode;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int maxElem=mat.length*mat[0].length;
        if(maxElem<r*c){
            return mat;
        }else{
            int[][] newMat=new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    int elem=mat[i][j];
                    for(int x=0;x<r;x++){
                        for(int y=0;y<c;y++){
                            newMat[x][y]=elem;
                        }
                    }
                }
            }
        return  newMat;

        }

    }
}
