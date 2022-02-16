package Basic;

public class math {
    public static void main(String[] args) {
        // finding the hypotenuse of the triangle
        double x=3.14;
        double y=-10;
        double z=Math.max(x, y);
        System.out.println("The highest number is "+z);
        // abs() method in math
        int negNumber=-100230;
        int posNumber=Math.abs(negNumber);
        System.out.println("Your negative number has been converted to "+posNumber);

        //Sqrt() method returns the square root of the given positive number
        int value=(int)Math.sqrt(169);
        System.out.println(value);
        

    }
}
