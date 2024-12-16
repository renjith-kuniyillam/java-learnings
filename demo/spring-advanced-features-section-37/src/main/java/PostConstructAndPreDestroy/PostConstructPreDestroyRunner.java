package PostConstructAndPreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PostConstructPreDestroyRunner {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(PostConstructPreDestroyRunner.class);
       context.getBean(SomeClass.class);
       context.close();

    }
}
