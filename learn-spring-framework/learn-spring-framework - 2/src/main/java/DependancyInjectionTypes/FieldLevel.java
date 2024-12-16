package DependancyInjectionTypes;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
class YourBusinessClass {

    private Dependancy1 dependancy1;

    private Dependacy2 dependacy2;

    @Autowired
    public YourBusinessClass(Dependancy1 dependancy1, Dependacy2 dependacy2) {
        System.out.println("YourBusinessClass :: Constructor called");
        this.dependancy1 = dependancy1;
        this.dependacy2 = dependacy2;
    }

//    @Autowired
//    public void setDependacy2(Dependacy2 dependacy2) {
//        System.out.println("Dependancy 2 :: Setter method called");
//        this.dependacy2 = dependacy2;
//    }
//
//    @Autowired
//    public void setDependancy1(Dependancy1 dependancy1) {
//        System.out.println("Dependancy 1 :: Setter method called");
//        this.dependancy1 = dependancy1;
//    }

    public String toString() {
        return "YourBusinessClass{" +
                "dependancy1=" + dependancy1 +
                ", dependacy2=" + dependacy2 +
                '}';
    }
}
@Component
class Dependancy1 {

}
@Component
class Dependacy2 {

}

@Configuration
@ComponentScan
public class FieldLevel {
    public static void main(String[] args) {
       try(var context = new AnnotationConfigApplicationContext(FieldLevel.class)) {
           var yourBusinessClass = context.getBean(YourBusinessClass.class);
           System.out.println(yourBusinessClass);
       }
    }
}
