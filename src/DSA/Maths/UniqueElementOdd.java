package DSA.Maths;

public class UniqueElementOdd {
    public static void main(String[] args) {
            int[] arr={2,2,3,3,7,8,8,8,7,7};
            int uniqueElement=0;
            for(int elem:arr){
                uniqueElement^=elem;
                uniqueElement&=elem;
            }



            System.out.println(uniqueElement);
    }
}
