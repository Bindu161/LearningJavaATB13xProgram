package ex_34_Generics;

import ex_01_Java_Basic.Bindu_Gupta;

public class Lab240_Generics {
    public static void main(String[] args) {

        temp_sum(3,8);
        temp_sum(3.34, 4.46);
        temp_sum("Bindu", "Gupta");
    }

    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}
