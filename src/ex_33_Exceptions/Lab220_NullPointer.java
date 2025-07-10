package ex_33_Exceptions;

public class Lab220_NullPointer {
    public static void main(String[] args) {

        String name = null;// Exception in thread "main" java.lang.NullPointerException
        name.trim();
    }
}
