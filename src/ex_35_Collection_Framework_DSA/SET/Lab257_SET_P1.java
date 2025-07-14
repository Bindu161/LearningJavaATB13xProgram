package ex_35_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab257_SET_P1 {
    public static void main(String[] args) {

        Set hs =  new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();


        hs.add("Bindu");
        hs.add("T");
        hs.add("T");
        System.out.println(hs);
    }
}
