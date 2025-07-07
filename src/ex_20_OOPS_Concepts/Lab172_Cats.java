package ex_20_OOPS_Concepts;

public class Lab172_Cats {
    public static void main(String[] args) {
                Cat c1 = new Cat();
                new Cat();
                Cat c2;

                c1.running();
                // c2.running();
                new Cat().running();

            }
        }

        class Cat{
            String name; // null

            void running() {
                System.out.println("Running");
            }
        }


