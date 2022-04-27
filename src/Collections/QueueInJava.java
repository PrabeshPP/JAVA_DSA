package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        //Queue in Java
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        //Printing the queue
        System.out.println(queue);

        //poll() function to return the element that would come first from the Queue
        System.out.println(queue.poll());

        //peek() function to show the head of the Queue
        System.out.println(queue.peek());



    }
}
