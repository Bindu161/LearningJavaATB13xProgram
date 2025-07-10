package ex_33_Exceptions;

public class Lab223_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Are you fool");
        } catch (Exception e) {
            System.out.println("Are you a fool too");
        }
        System.out.println("2");
    }
}


