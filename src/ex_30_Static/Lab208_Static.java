package ex_30_Static;

public class Lab208_Static {
    public static void main(String[] args) {

    }

}

class B{
    static {
        System.out.println("SIB, called once, class is loaded ");
    }
    int a =10;
    static int b =10;


    void display(){
        System.out.println(b);
        System.out.println("Non static f(n)");
    }

    static void commonToAll(){
//        System.out.println(a);
        System.out.println("Static f(n)");
    }
static class C{

}
}
