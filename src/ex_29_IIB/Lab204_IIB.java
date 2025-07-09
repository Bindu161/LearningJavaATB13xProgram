package ex_29_IIB;

public class Lab204_IIB {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

    }
}

class A{
    A(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
    }

    {
        System.out.println("Hi, I am IIB2");
    }

    {
        System.out.println("Hi, I am IIB3");
    }
    {
        System.out.println("If you want to execute or call something when object is created");
    }
}
