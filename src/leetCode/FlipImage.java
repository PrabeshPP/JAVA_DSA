package leetCode;

public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] newArr=new int[image.length][image.length];
        for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                newArr[row][col]=image[row][image[row].length-1-col];

            }

        }
    return  newArr;
    }
}
