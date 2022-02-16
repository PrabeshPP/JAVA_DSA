package Basic;

import java.util.Random;

public class Scope {

    // constructor of our class Scope
    Random random;
    int number;
    Scope(){
       random=new Random();
         number=0;
    }

    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);;
    }
    
}
