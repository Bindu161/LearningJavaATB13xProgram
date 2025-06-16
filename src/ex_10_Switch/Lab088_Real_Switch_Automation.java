package ex_10_Switch;

import java.util.Scanner;

public class Lab088_Real_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start!!");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser) {
            case  "chrome":
                System.out.println("Starting the browser");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                    System.out.println("Enter the firefox browser");
                    break;
                    case "Edge":
            System.out.println("Enter the edge");
            default:
                System.out.println("I have no idea which browser is this");


        }
    }
}
