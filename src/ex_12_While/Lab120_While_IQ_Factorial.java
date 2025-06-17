package ex_12_While;

import java.util.Scanner;

public class Lab120_While_IQ_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\n Enter the number1");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i < number; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is ->" + factorial);
    }
}