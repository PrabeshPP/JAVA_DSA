package leetCode.search;

public class Main1539 {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
//        MissingInteger missingInteger=new MissingInteger();
//        int missingInteger1=missingInteger.findKthPositive(arr,5);
//        System.out.println(missingInteger1);

        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
        int pos=searchInsertPosition.searchInsert(arr,7);
        System.out.println(pos);
    }
}