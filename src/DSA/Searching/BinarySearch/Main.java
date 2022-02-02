package DSA.Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        BinarySearch binarySearch=new BinarySearch(arr,3);
        int index=binarySearch.find();
        System.out.println("The target number is at "+index);

    }
}
