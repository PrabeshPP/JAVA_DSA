import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random=new Random();
        //Generating random integer

        int x=random.nextInt(6)+1;
        System.out.println(x);

        //Generating random double 
        double y=random.nextDouble(40);
        System.out.println(y);

        //Generating random boolean
        boolean b=random.nextBoolean();
        System.out.println(b);

    }
    
}
