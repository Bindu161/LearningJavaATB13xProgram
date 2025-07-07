package ex_21_OOPS_Constructor;

public class Lab177_Example {
    public static void main(String[] args) {
        WebAutomation w1= new WebAutomation();
    }
}

class WebAutomation {
    WebAutomation(){
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when an object is created");

    }
}