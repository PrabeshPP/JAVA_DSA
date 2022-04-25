package DSA.Maths;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};
        int uniqueElement=0;
        for(int i:arr){
            uniqueElement^=i;
        }
        System.out.println(uniqueElement);
    }
}
