package ex_18_StringBuffer_Builder_StringFunctions;

import javax.management.MBeanAttributeInfo;

public class Lab152_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");

        System.out.println(sb);
        sb.delete(4,15);
        System.out.println(sb);
        sb.replace(0,3,"C++");
        System.out.println(sb);
    }
}
