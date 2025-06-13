package ex_06_Ternary_Operator;

public class Lab64_TO {
    public static void main(String[] args) {
        int x = 40;
        int y = 60;
//        System.out.println(Math.min(x, y));

        int min = x < y ? x : y;
        System.out.println(min);
    }
}
