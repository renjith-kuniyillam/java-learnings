package Interfaces;

public class DefaultMethodInterface {

    interface TestInterface {
        void display();

        default void show() {
            System.out.println("Default Method");
        }
    }

    class TestClass implements TestInterface {
        public void display() {
            System.out.println("Overridden Default Method");
        }
    }

    class TestClass2 implements TestInterface {
        public void display() {
            System.out.println("Overridden Default Method");
        }
    }

}
