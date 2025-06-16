package ex_10_Switch;

import java.util.Scanner;

public class Lab085_Switch {
    public static void main(String[] args) {
// int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}


