package ex_35_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab258_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();

        hs.add("Apple");
        hs.add("Orange");
        hs.add("watermelon");
        hs.add("watermelon");
       // hs.add(123);
        hs.add(null);

        System.out.println(hs);

        for (String s: hs){
            System.out.println(s);
        }
        System.out.println("---------------");

        Set lhs = new LinkedHashSet();

        lhs.add("Dpple");
        lhs.add("orange");
        lhs.add("watermelon");
        lhs.add("watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Dpple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet();


        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");

        System.out.println(ts);

        System.out.println("-------For Each----");

        for (Object o : ts){
            System.out.println(o);
        }


    }
}
