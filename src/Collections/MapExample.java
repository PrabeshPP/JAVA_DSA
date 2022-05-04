package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String ,Integer> numbers=new TreeMap<>();
        //Key should be unique in thr map
        //else it will override the key and value
        numbers.put("three",3);
        numbers.put("one",1);
        numbers.put("two",2);

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

        //iterating through the map
        for(Map.Entry<String,Integer> x: numbers.entrySet()){
            System.out.println(x);
        }
        System.out.println(numbers);
    }
}
