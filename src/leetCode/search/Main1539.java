package leetCode.search;

public class Main1539 {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,9,11,14,15};
        MissingInteger missingInteger=new MissingInteger();
        int missingInteger1=missingInteger.findKthPositive(arr,5);
        System.out.println(missingInteger1);
    }
}
