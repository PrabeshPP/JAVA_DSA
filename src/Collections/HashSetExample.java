package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(23);
        set.add(40);
        set.add(50);
        set.add(56);
        set.add(70);
        set.add(75);

        System.out.println(set);

    }
}
