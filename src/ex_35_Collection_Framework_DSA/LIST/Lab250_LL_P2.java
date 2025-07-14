package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab250_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList();

        List mylist2 = new LinkedList();

        mylist2.add("Bindu");
        mylist2.add("Sindhu");
        mylist2.add(123);
        mylist2.add("rithwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add("jyothi");
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Bindu"));
        System.out.println(mylist2.indexOf("Bindu"));
        System.out.println(mylist2.get(0));
    }
}
