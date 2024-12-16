package SingletonAndPrototypeScops;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SingletonAndPrototypeScops")
public class ScopeRunnerApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ScopeRunnerApp.class);
        System.out.println("Context loaded");
        System.out.println(context.getBean(PrototypeScope.class));
        System.out.println(context.getBean(PrototypeScope.class));
        System.out.println(context.getBean(PrototypeScope.class));
        System.out.println(context.getBean(PrototypeScope.class));
        System.out.println(context.getBean(PrototypeScope.class));
        System.out.println(context.getBean(PrototypeScope.class));

        System.out.println("+++++++++++++++++++++++++++++++++++");


        System.out.println(context.getBean(SingletonClass.class));
        System.out.println(context.getBean(SingletonClass.class));
        System.out.println(context.getBean(SingletonClass.class));
        System.out.println(context.getBean(SingletonClass.class));



    }
}
