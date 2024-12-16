package LazyInitialization;

import jdk.jfr.DataAmount;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("LazyInitialization")
public class LazyInitializationDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationDemo.class);
        System.out.println("Context loaded");
        context.getBean(ClassB.class).doSomething();
    }
}
