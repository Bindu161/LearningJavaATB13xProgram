package ex_32_Wrapper_Class;

import java.util.PropertyResourceBundle;

public class Lab217_Wrapper {
    public static void main(String[] args) {

    }

}



class  Mobile extends OldPhone{


    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier ="airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price){

    this.phone =phone;
    this.name = name;
    this.price =price;
    }
    void display(){
        System.out.println(this.name+this.phone+this.price);
    }
}

class OldPhone implements SIMcard{



    void calling(){
        System.out.println("dialpad");
    }

    public void entercard(){
        System.out.println("Card entered");
    }
}
interface SIMcard{
    void entercard();
}
