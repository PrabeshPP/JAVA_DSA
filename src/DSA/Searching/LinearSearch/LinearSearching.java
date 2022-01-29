package DSA.Searching.LinearSearch;

public class LinearSearching {
    int Linearsearch(int[] list,int target){
        int position=-1;
        int n=0;
        while (n<list.length){
            if(list[n]==target){
                position=n;
                return position;
            }

            ++n;
        }



        return -1;


    }
}
