package DSA.Searching.LinearSearch;

public class linear_searching_range {
    int linearSearchingRange(int[] list ,int target){
        int n=1;
        while(n<4){
            if(list.length==0){
                return -1;
            }else {
                if(target==list[n]){
                    return n;
                }

            }

            ++n;

        }
        return  -1;
    }
}
