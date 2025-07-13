package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab246_ArrayList {
    public static void main(String[] args) {
        //List l = new ArrayList();//
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hi Sir");
        arrayList.add(null);
        arrayList.add("Sai");
        arrayList.add("Baba");
        arrayList.add("Baba");
        arrayList.add(143);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());


        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
