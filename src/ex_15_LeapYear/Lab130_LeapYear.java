package ex_15_LeapYear;

import java.util.Scanner;

public class Lab130_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Years");

        int ch = scanner.nextInt();
        if (ch%6 == 0){

            System.out.println("This is a leap year!");
        }
        else{
            System.out.println("This is not a leap year!");
        }
        scanner.close();
    }
}
