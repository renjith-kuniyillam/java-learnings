package LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassA {

    public ClassA() {
        System.out.println("Class A Constructor");
    }

    public void doSomething() {
        System.out.println("Class A ::->Doing something");
    }

}
