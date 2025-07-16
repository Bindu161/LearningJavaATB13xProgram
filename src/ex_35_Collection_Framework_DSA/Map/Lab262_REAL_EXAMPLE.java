package ex_35_Collection_Framework_DSA.Map;

import java.util.*;

public class Lab262_REAL_EXAMPLE {
    public static void main(String[] args) {
        Map<String, Object>student1= new HashMap();
        student1.put("name","Suman");
        student1.put("phone","7987383");
        student1.put("address1","Hyderabad");
        student1.put("address2","500035");

        Map<String, Object>student2= new HashMap();
        student2.put("name","Jyothi");
        student2.put("phone","6975473");
        student2.put("address1","Hyderabad");
        student2.put("address2","500070");

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);

    }
}
