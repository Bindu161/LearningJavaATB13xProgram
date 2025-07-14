package ex_35_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab259_QUEUE {
    public static void main(String[] args) {

        PriorityQueue q =  new PriorityQueue();
        q.add("Mounika");
        q.add("Taksh");

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
