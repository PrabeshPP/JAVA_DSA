package DSA.Maths;

public class Math {

    public static void main(String[] args) {
        String result=oddOREven(10);
        System.out.println(result);


    }

    static String oddOREven(int Number){
        return (Number&1)==1?"Odd":"Even";
    }
}
