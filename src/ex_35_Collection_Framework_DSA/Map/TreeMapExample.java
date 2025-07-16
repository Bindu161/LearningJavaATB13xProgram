package ex_35_Collection_Framework_DSA.Map;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<String, Integer> values = new TreeMap();
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);

        System.out.println("TreeMap (sorted by keys):"+ values);

        values.replace("First", 11);
        values.replace("second", 22);

        System.out.println("After replacement:"+ values);

        // Remove element
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
        System.out.println("Final map: " + values);



    }
}
