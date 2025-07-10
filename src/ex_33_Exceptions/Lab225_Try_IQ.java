package ex_33_Exceptions;

public class Lab225_Try_IQ {
    public static void main(String[] args) {
        String s2= null;
        try {
            s2.trim();
            int a =10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");;
        }catch (Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");
    }
}
