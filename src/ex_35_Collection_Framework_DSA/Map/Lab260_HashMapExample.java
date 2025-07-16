package ex_35_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab260_HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap();
        vehicles.put("XUV300", 1);
        vehicles.put("i20", 2);
        vehicles.put("honda activa", 1);
        vehicles.put("BMW", 2);
        vehicles.put("TESLA", 5);
        vehicles.put("TESLA", 10);

        System.out.println("Total vehicles"+ vehicles.size());

        for (String key : vehicles.keySet()) {
            System.out.println(key + "Values:" + vehicles.get(key));
        }
        // Checking if key exists
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // Clearing the map
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());

    }
}
