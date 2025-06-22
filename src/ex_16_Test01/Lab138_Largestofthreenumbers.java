package ex_16_Test01;

import java.util.Scanner;

public class Lab138_Largestofthreenumbers {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter three integers (separated by space): ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if (a >= b && a >= c) {
                    if (a == b && a == c) {
                        System.out.println("All numbers are equal.");
                    } else {
                        System.out.println(a + " is the largest number.");
                    }
                } else if (b >= a && b >= c) {
                    System.out.println(b + " is the largest number.");
                } else {
                    System.out.println(c + " is the largest number.");
                }

                scanner.close();
            }
        }


