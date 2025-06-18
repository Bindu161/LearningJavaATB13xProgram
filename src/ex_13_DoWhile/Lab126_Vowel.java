package ex_13_DoWhile;

import java.util.Scanner;

public class Lab126_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "is a vowel!");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "is a consonent");
        } else {
            System.out.println("Invalid character");
        }
        scanner.close();
    }
}