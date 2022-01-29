package DSA.Searching.LinearSearch;

public class WealthFinder {
    int wealthfinder(int[][] arr){
        int sum=0;
        int totalWealth=0;

        for (int[] ints : arr) {
            for( int x:ints){
                totalWealth+=x;
            }
            if(totalWealth>sum){

                sum=totalWealth;

            }
            totalWealth=0;

        }
        return sum;
    }
}
