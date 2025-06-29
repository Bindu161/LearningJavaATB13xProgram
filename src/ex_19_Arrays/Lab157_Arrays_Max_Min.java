package ex_19_Arrays;

import java.util.Arrays;

public class Lab157_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {15, 37, 45, 63, 70, 120, 147};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}