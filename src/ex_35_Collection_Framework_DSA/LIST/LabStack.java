package ex_35_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class LabStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("Python");
        s1.add( "C#");
        s1.add("Java");
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);
    }
}
