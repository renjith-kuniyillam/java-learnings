package PostConstructAndPreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    private SomeDependancy someDependancy;

    public SomeClass(SomeDependancy someDependancy) {
        this.someDependancy = someDependancy;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("SomeClass PostConstruct");
        this.someDependancy.doSomething();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SomeClass PreDestroy");
        this.someDependancy.cleanUp();
    }
}
