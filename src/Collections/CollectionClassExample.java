package Collections;

import java.util.*;

public class CollectionClassExample {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(10);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);

        List<Student> list=new ArrayList<>();
        list.add(new Student("Prabesh",20));
        list.add(new Student("Carlo",10));
        list.add(new Student("Tom",19));
        //using lambda expression
        Collections.sort(list, (o1,o2)->o1.name.compareTo(o2.name));
        System.out.println(list);
    }
}
