package AccessModifiers;

public class AnotherClass {
    public AnotherClass() {
        System.out.println("AnotherClass Constructor");
        ClassModifiers clm = new ClassModifiers();
        clm.publicMethod();
//        clm.privateMethod();
        clm.protectedMethod();
        clm.defaultMethod();
    }
}
