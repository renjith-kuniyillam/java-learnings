package FinalClassesAndMethods;

public class SomeClass {
    String str = "";
    Integer i = Integer.valueOf("1");

    public final void someMethodFinal() {
        System.out.println("Some Method final");
    }

    public void someMethodWithFinalVarialbe() {
        final int i = 10;
        System.out.println(i);

    }

    public void someMethodWithFinalArgument(final int i) {
        System.out.println(i);
    }
}



