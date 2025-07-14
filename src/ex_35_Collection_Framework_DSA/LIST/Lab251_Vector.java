package ex_35_Collection_Framework_DSA.LIST;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.Vector;

public class Lab251_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);


        v.add("Bindu");
        v.add("Chinna");
        v.add("venkat");
        System.out.println(v);
        v.remove("sai");
        System.out.println(v.contains("chinna"));
        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));

        }

        System.out.println("------ For Each Loop");

    }
}

