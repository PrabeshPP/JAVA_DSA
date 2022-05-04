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
        for(String e: numbers.keySet()){
            System.out.println(e);
        }

        //iterating through the values
        for(int i: numbers.values()){
            System.out.println(i);
        }
//        System.out.println(numbers);
    }
}
