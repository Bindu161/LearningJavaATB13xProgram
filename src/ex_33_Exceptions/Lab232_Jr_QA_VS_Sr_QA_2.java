package ex_33_Exceptions;

public class Lab232_Jr_QA_VS_Sr_QA_2 {
    public static void main(String[] args) {
        // QA
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
