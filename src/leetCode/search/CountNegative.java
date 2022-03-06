package leetCode.search;

public class CountNegative {
    public int countNegatives(int[][] grid) {
        int number=0;
        int lower_bound=0;
        int upper_bound=grid[0].length-1;
        while(lower_bound< grid.length && upper_bound>=0){
            if(grid[lower_bound][upper_bound]<0){
                number++;
                upper_bound--;
            }else {
                lower_bound++;
                upper_bound= grid[0].length-1;
            }
        }



        return number;
    }
}
