package PostConstructAndPreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SomeDependancy {
    public void doSomething() {
        System.out.println("Some Dependancy ::-> Doing something");
    }

    public void cleanUp() {
        System.out.println("Some Dependancy ::-> Clean up");
    }
}
