package ex_33_Exceptions;

public class Lab239_Custom_Exception_Example {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR", 200);
        Bank icici =  new Bank("INR", 223);
        int total = sbi.add(icici);
        System.out.println(total);

        Bank jp_chase = new Bank("USD",101);
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);
    }
}
