package ex_33_Exceptions;

public class Lab237_Throw {
    public static void main(String[] args) {

    }

    static void divideByZero(int b){
        if (b==0){
            throw  new ArithmeticException("Error a ==0");

        }
    }
}
