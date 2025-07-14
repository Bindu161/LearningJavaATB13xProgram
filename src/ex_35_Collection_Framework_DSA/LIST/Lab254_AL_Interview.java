package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab254_AL_Interview {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(100);
        marks.add(95);
        marks.add(70);
        marks.add(65);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
