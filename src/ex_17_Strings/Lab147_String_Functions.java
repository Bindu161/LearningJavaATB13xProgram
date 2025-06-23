package ex_17_Strings;

public class Lab147_String_Functions {
    public static void main(String[] args) {

        String name = "Mrunal";
        System.out.println(name. length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(1));

        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Mrunal"));
        System.out.println(name.equalsIgnoreCase("Mrunal"));

        System.out.println(name.indexOf('0'));

        String s1 ="madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));

        System.out.println(name.length());

        System.out.println(name.replace('n', 'N'));
    }
}
