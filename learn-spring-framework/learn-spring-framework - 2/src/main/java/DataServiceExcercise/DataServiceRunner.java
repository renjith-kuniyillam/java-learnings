package DataServiceExcercise;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Data
@ComponentScan("DataServiceExcercise")
public class DataServiceRunner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DataServiceRunner.class);
        var dataService = context.getBean(DataService.class);

       Arrays.stream(dataService.retriveData()).forEach(System.out::println);

    }
}
