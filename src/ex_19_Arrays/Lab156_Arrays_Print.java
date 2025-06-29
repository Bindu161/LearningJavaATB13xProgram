package ex_19_Arrays;

import java.util.Arrays;

public class Lab156_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {40, 65, 85, 90, 120};
        System.out.println("-------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

            Arrays.sort(marks);

        }
    }
}