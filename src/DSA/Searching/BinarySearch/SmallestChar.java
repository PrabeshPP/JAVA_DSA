package DSA.Searching.BinarySearch;

public class SmallestChar {
    char findSmallestChar(char[]letters,char target){
        int start=0;
        int end=letters.length-1;
        if(letters[end]<target){
            return letters[start];
        }else{
            while(start<=end){
                int mid=start+(end-start)/2;
                if(letters[mid]>target){
                    end=mid-1;
                }else if(letters[mid]<=target){
                    start=mid+1;
                }
            }
            return  letters[start];

        }

    }
}
