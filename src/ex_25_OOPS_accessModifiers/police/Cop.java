package ex_25_OOPS_accessModifiers.police;

public class Cop {

   public int gun;
    String idCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }
      protected void canIShoot() {
            System.out.println("Yes can you !!");
        }
        void thisDefaultF1(){
            System.out.println("Hi Cop !");
        }
    }
