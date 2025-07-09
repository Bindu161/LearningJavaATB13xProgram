package ex_30_Static;

public class Lab207_Static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        System.out.println(P.a);
        p1.a =15;
        System.out.println(P.a);
        System.out.println(p1.a);
        System.out.println(p2.a);

        p1.b = 34;
        p2.b = 44;
        System.out.println(p1.b);
        System.out.println(p2.b);
    }
}


class P{
    static int a = 20;
    int b =10;

    static {
        // this is a static block
        //this is called whenever a class is loaded
        System.out.println("Hi this is called, because, class is loaded");
    }
}