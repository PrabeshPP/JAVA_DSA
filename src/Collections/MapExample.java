package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String ,Integer> numbers=new HashMap<>();
        //Key should be unique in thr map
        //else it will override the key and value
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        if(!numbers.containsKey("one")){
            numbers.put("one",2);
        }

        //iterating through the keys
        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
        }
//        System.out.println(numbers);
    }
}
