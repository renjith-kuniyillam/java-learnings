package LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {


    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Class B Constructor");
        this.classA = classA;
    }
    public void doSomething() {
        System.out.println("Class B ::->Doing something");
        this.classA.doSomething();
    }

}
