package Basic;

import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        String[] animals={"cat","dog","horse"};
        for(String x: animals){
            System.out.println(x);

        }

        ArrayList<String> animals1=new ArrayList<>();
        animals1.add("dog");
        animals1.add("cat");
        animals1.add("horse");
        animals1.add("bird");

        for(String i:animals1){
            System.out.println(i);;
        }
        
    }
    
}
