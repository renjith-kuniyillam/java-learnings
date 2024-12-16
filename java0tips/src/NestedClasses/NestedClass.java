package NestedClasses;

public class NestedClass {
    private int id;

    public NestedClass(int identifier) {
        id = identifier;
    }

    public class InnerClass {
        public void printId() {
             System.out.println(id);
        }
    }

    public static class StaticNestedClass {
        public void printId() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass(1);
       InnerClass innerClass = nestedClass.new InnerClass();
       innerClass.printId();

         StaticNestedClass staticNestedClass = new StaticNestedClass();
         staticNestedClass.printId();
    }

}
