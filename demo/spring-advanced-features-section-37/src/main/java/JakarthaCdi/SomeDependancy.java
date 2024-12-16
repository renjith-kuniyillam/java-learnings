package JakarthaCdi;

import jakarta.inject.Named;
import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeDependancy {
    public void doSomething() {
        System.out.println("do something");
    }
}
