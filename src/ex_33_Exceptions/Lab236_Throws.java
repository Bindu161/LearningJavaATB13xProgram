package ex_33_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab236_Throws {
    public static void main(String[] args) {

    }

    static void t1() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("C.//abc.txt");
    }
}
