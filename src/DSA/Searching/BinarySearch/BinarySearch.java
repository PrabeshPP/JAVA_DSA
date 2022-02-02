package DSA.Searching.BinarySearch;

public class BinarySearch {
   int[] arr;
   int target;

    public BinarySearch(int[] arr1, int target) {
        this.arr = arr1;
        this.target = target;
    }

    int initialPos=0;
    int finalPos=arr.length-1;
    int mid=(initialPos+finalPos)/2;


    int find(){
        while(initialPos<finalPos){
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
