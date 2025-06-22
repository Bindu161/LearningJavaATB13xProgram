package ex_16_Test01;

public class Lab136_OperatorPrecedence_Typecasting {
    public static void main(String[] args) {

                int result = 5 + 2 * 3 + (4 / 2);

                result = 5 + 2 * 3 + 4 * 3;  // 2*3 = 6, 4*3 = 12 → 5+6+12 = 23
                System.out.println("Expression result: " + result);

                int intVal = 13;
                double implicitCast = intVal + 0.5;  // 13 becomes 13.0, then + 0.5 = 13.5
                System.out.println("Implicit casting: " + implicitCast);

                double doubleVal = 13.9;
                int explicitCast = (int) doubleVal; // fractional part truncated
                System.out.println("Explicit casting: " + explicitCast);
            }
        }

