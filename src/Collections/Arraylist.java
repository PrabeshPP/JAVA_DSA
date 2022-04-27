package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(90);
        list.add(100);
        System.out.println(list);


    }
}
