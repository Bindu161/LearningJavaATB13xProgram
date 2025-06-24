package ex_17_Strings;

import java.util.Scanner;

public class Lab148_InterviewCoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.next();

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static String reverseString(String userInput) {

        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) ;
        reversed = reversed + userInput.charAt(i);
    }
}


