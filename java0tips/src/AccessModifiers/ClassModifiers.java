package AccessModifiers;

//public, private (default), protected
public class ClassModifiers {
    public ClassModifiers() {
        System.out.println("Constructor");
        ClassModifiers clm = new ClassModifiers();
        clm.publicMethod();
        clm.privateMethod();
        clm.protectedMethod();
        clm.defaultMethod();
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod () {
        System.out.println("Default method");
    }
}
