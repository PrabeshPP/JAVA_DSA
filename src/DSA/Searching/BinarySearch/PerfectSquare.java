package DSA.Searching.BinarySearch;

public class PerfectSquare {

    boolean findPerfectSquare(long num){
        long start=1;
        long end=num/2;
        if(num==1){
            return true;
        }else{
            while(start<=end){
                long mid=start+(end-start)/2;
                if(mid*mid==num){
                    return true;
                }else if(mid*mid<num){
                    start=mid+1;
                }else if(mid*mid>num){
                    end=mid-1;
                }
            }

        }

        return false;



    }
}
