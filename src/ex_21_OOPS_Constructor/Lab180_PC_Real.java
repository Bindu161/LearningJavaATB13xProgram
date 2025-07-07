package ex_21_OOPS_Constructor;

public class Lab180_PC_Real {
    public static void main(String[] args) {

        Person p1 = new Person("Taksh", 984567, "abc");
        System.out.println(p1.name);
        Person p2 = new Person("Bindu", 65387898, "XYZ");

        Person p3 = new Person();
        p3.name = "smita";
        System.out.println(p3.name);
    }
}

class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name= name_user;

    }

    Person(String name_user, long phone_user, String address_user){
        this.name=name_user;
        this.address=address_user;
        this.phone= phone_user;
    }

    Person(String name_user, long phone_user){
        this.name=name_user;
        this.phone=phone_user;
    }
}
