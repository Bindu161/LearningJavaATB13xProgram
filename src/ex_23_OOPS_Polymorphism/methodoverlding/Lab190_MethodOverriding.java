package ex_23_OOPS_Polymorphism.methodoverlding;

public class Lab190_MethodOverriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
    }
    }

    class Animal {

        void sound() {
            System.out.println("Default sound");
        }
    }
    class Dog extends Animal{

        @Override
        void sound(){
            System.out.println("Bark! ");
        }

    }

