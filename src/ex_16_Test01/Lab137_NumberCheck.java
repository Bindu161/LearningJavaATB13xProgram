package ex_16_Test01;

import java.util.Scanner;

public class Lab137_NumberCheck {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                if (number > 0) {
                    System.out.println(number + " is positive.");
                } else if (number < 0) {
                    System.out.println(number + " is negative.");
                } else {
                    System.out.println("0 is zero.");
                }

                scanner.close();
            }
        }


