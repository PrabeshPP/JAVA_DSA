package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        set.add(new Student("Prabesh",20));
        set.add(new Student("Carlo",1));
        set.add(new Student("Tom",1));



        System.out.println(set);

    }
}
