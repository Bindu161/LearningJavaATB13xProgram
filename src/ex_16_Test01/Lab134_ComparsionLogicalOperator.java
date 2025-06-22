package ex_16_Test01;

public class Lab134_ComparsionLogicalOperator {
    public static void main(String[] args) {

                int a = 40;
                int b = 10;


                System.out.println("a == b: " + (a == b));
                System.out.println("a > b: " + (a > b));
                System.out.println("a < b: " + (a < b));

                System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
                System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
                System.out.println("!(a > b): " + (!(a > b)));
            }
        }


