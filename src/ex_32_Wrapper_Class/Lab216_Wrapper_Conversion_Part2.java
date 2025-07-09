package ex_32_Wrapper_Class;

public class Lab216_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {

        String num ="10";

        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);


        int aa = Integer.parseInt(num);

        System.out.println(a.toString());

        int age = 10;
        Integer age_wrapper =age;
        System.out.println(age_wrapper.toString());
    }
}
