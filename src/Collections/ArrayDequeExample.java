package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {

        //ArrayDeque can be use to implement stack and Queue
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.offer(90);

        // It will add the element in the from the first
        arrayDeque.offerFirst(99);
        //it will add the element from the last
        arrayDeque.offerLast(120);
        arrayDeque.offer(90);
        //
        System.out.println(arrayDeque);

        //polling the element from the first
        System.out.println(arrayDeque.pollFirst());

        //polling the element from the last
        System.out.println(arrayDeque.pollLast());

        //peeking the element from the first
        System.out.println(arrayDeque.peekFirst());

        //peeking the element from the last
        System.out.println(arrayDeque.peekLast());
    }
}
