package ex_14_Functions;

public class Lab131_User_Defined_Function {
    public static void main(String[] args) {

    int result = sum_of_number(4,8);

    sum_of_number_no_return(4, 6);
        System.out.println(result);
}

    static int sum_of_number(int a, int b) {
        return a + b;

    }
    static void sum_of_number_no_return(int a, int b){
        System.out.println(a+b);

    }
}
