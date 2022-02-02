package DSA.Searching.BinarySearch;

public class BinarySearch {





    int find(int[] arr,int target){
        int initialPos=0;
        int finalPos=arr.length-1;
        int mid=(initialPos+finalPos)/2;
        while(initialPos<=finalPos){
            if(target==arr[mid]){
                return mid;

            }
            else if(target>arr[mid]){
                initialPos=mid+1;
                mid=(initialPos+finalPos)/2;
            }else{
                finalPos=mid-1;
                mid=(initialPos+finalPos)/2;

            }

        }
    return  -1;

    }

}
