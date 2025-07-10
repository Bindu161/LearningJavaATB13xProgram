package ex_33_Exceptions;

public class Lab218_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program!");

        String input_user =args[0];// ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        Integer a =Integer.parseInt(input_user);// NumberFormatException: For input string: "Bindu"
        Integer output = 100/a;// ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("Ending the program!");
    }
}
