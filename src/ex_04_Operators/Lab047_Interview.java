package ex_04_Operators;

public class Lab047_Interview {
    public static void main(String[] args) {
        int balaji_salary = 19;
        boolean b = !(balaji_salary > 15 || balaji_salary < 10);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
