package ex_33_Exceptions;

public class Lab229_Try_Catch_Finally {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        try {
            int c = 10;
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
          //   e.printStackTrace();//
        } finally {
            System.out.println("I will be always executed");
        }
    }
}