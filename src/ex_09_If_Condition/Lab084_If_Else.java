package ex_09_If_Condition;

import java.util.Scanner;

public class Lab084_If_Else {
    public static void main(String[] args) {

                System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
         int age = Integer.parseInt(args[0]);
//                int age = scanner.nextInt();

                int a = 10;

                if(age <= 18){
                    System.out.println("Not allowed to vote!");
                }else{
                    System.out.println("Allowed to vote");
                }


            }
        }


