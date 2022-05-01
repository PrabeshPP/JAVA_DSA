package Collections;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(99);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        //poll
        System.out.println(pq.poll());

        //
        System.out.println(pq.peek());

    }
}
