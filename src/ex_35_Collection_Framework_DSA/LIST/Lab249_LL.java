package ex_35_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab249_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println("LinkedList:"+ animals);

        System.out.println("First element:"+ animals.getFirst());
        System.out.println("Last element:"+ animals.getLast());

animals.removeFirst();
animals.removeLast();

        System.out.println("LinkedList after removal:"+ animals);
        System.out.println("Size of LinkedList:" + animals.size());
    }
}
