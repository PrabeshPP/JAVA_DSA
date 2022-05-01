package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListExample {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(23);
        set.add(40);
        set.add(50);
        set.add(56);
        set.add(70);
        set.add(75);

        System.out.println(set.contains(20));
        System.out.println(set.size());
    }
}
