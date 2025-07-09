package ex_28_Abstraction_Interface;

import org.w3c.dom.css.Rect;

public class Lab200_Interface {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(10, 20);

        Square s1 = new Square();
        s1.getArea(3, 8);
    }
}
    class Rectangle implements Polygon {
        @Override
        public void getArea(int length, int breadth) {
            System.out.println("The area of rectangle is " + (length * breadth));
        }
    }

    class Square implements Polygon {

        @Override
        public void getArea(int length, int breadth) {
            System.out.println("Area of Square ->" + 3.14 * length * breadth);
        }
    }

    interface Polygon {
        void getArea(int length, int breadth);

        default void complete() {
            System.out.println("This is possible");

        }

        static void staticComplete() {
            System.out.println("Static F1 in interface allowed, complete");
        }
    }

    abstract class A {

        abstract void m1();

        void complete() {
            System.out.println("Complete");
        }
    }

