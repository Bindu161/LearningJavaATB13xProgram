package ex_18_StringBuffer_Builder_StringFunctions;

public class Lab153_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Saibaba";
        String s1 = new String("Saibaba");


        StringBuffer stringBuffer = new StringBuffer("Saibaba");
        StringBuilder stringBuilder = new StringBuilder("Saibaba");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
