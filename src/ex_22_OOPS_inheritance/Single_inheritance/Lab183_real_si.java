package ex_22_OOPS_inheritance.Single_inheritance;


public class Lab183_real_si {
    public static void main(String[] args) {
        Testcase1 t1 = new Testcase1();
        t1.runningTC1();

        Testcase2 t2 = new Testcase2();
        t2.runningTC2();

        CommonToAll c1 = new Testcase1();
        c1.startBrowser();
    }
}