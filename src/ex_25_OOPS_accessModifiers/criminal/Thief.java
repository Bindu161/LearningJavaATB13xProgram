package ex_25_OOPS_accessModifiers.criminal;

import ex_25_OOPS_accessModifiers.police.Cop;

import javax.print.attribute.standard.Copies;

public class Thief {
    public static void main(String[] args) {


        Cop thief = new Cop(100);
        thief.gun =100;
//        thief.canIShoot();

    }
}
