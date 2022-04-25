package DSA.Maths;

public class Math {

    public static void main(String[] args) {
        oddOREven(19);


    }

    static void oddOREven(int Number){
        if((Number&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
