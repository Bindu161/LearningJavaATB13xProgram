package ex_18_StringBuffer_Builder_StringFunctions;

public class Lab151_SBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder( "Hi");
        stringBuilder.append("Bye");

        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
