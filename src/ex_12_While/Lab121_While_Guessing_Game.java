package ex_12_While;

import java.util.Random;
import java.util.Scanner;

public class Lab121_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int guess;
        int attempts =0;
        while (true){
            System.out.println("Enter another guess!");
            guess = scanner.nextInt();
            attempts++;

        }
    }
}
