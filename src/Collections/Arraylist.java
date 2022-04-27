package Collections;

import java.util.ArrayList;
import java.util.Iterator;
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

        // removing data from the ArrayList
        list.remove(Integer.valueOf(60));
        System.out.println(list);

        //updating the value in the list
        list.set(0,5000);
        System.out.println(list);

        //Check whether a list contain a given element or not
       System.out.println( list.contains(5000));

       //iterating through a list
        Iterator<Integer> li=  list.iterator();
        System.out.println(li.hasNext());


        //Stack in java









    }
}
