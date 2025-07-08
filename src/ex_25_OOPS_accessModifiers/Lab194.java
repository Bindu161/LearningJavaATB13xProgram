package ex_25_OOPS_accessModifiers;

public class Lab194 {

}

class Father{
    private int gold = 10;
    int car= 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
//        System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}