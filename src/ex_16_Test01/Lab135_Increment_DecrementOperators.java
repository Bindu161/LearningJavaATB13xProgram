package ex_16_Test01;

public class Lab135_Increment_DecrementOperators {
    public static void main(String[] args) {

        int value = 5;
        System.out.println("Original: " + value);

        int preIncrement = ++value;
        System.out.println("Pre-increment: " + preIncrement);


        int postIncrement = value++;
        System.out.println("Post-increment: " + value + " (returned " + postIncrement + ")");


        int preDecrement = --value;
        System.out.println("Pre-decrement: " + preDecrement);

        int postDecrement = value--;
        System.out.println("Post-decrement: " + value + " (returned " + postDecrement + ")");
    }
}

