package JakarthaCdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JakarthaCdiRunner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(JakarthaCdiRunner.class);
        var someClass = context.getBean(SomeClass.class);
        someClass.getSomeDependancy().doSomething();
        context.close();
    }
}
