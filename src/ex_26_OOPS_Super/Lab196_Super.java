package ex_26_OOPS_Super;

public class Lab196_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }
}
 class God {
    public int gold =100;
     void sound() {
         System.out.println("God!");
     }

     God() {
         System.out.println("God DC");
     }
 }
 class Animal extends God{

     @Override
     void sound() {
         super.sound();
     }
         Animal(){
             super();
         }
         Animal(int a , int b){
             System.out.println(a+b);
         }
         void test(){
             System.out.println(super.gold);
         }
     }