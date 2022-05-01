package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Tree set is used to store unique element and in sorted way
        Set<Integer> set=new TreeSet<>();
        set.add(23);
        set.add(40);
        set.add(50);
        set.add(56);
        set.add(70);

        System.out.println(set);

    }
}
