package ex_21_OOPS_Constructor;

public class Lab178_DC {
    public static void main(String[] args) {
        Car c1= new Car();
        Car c2= new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(c2.name);
        c2.name= "Audi";
        System.out.println(c2.name);
    }
}
class Car {
String name;
int year;
String model;

Car() {
    name = " Unknown Car";
    year = 1992;
    model = "XXX";
}
}

class Baby1{
    String name;
    Baby1(){
        name= "Taksh";
        System.out.println("Taksh");
    }
}