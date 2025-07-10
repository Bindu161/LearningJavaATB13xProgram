package ex_33_Exceptions;

public class Lab221_Handle_Exception {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/0; // java.lang.ArithmeticException
        } catch (Exception e) {
            System.out.println("Divide by zero not allowed");
        }
        System.out.println(a);
    }
}
