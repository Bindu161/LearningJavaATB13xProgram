package ex_19_Arrays;

public class Lab168_Star_Pattern {
    public static void main(String[] args) {
         int n =5;
        for (int i =1; i<=n ; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            for (int m = 2; m < i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

