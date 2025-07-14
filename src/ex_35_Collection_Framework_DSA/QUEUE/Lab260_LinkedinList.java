package ex_35_Collection_Framework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab260_LinkedinList {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList();
        queue.add(6);
        queue.add(10);
        queue.add(12);
        System.out.println(queue);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext());
        Integer value = iterator.next();
        System.out.println(value);
    }
}
