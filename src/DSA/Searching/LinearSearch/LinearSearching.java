package DSA.Searching.LinearSearch;

public class LinearSearching {
    int Linearsearch(int[] list,int target){
        int n=0;
        while (n<list.length){
            if(list[n]==target){
               return n;
            }

            ++n;
        }
        return -1;


    }
}
