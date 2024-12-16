package com.FirstSpring.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class HelloWorldGameRunner {
    public static void main(String[] args) {
      var applicationContext = new AnnotationConfigApplicationContext(HelloWorldApplicationConfiguration.class);

      var getNameToPrint = applicationContext.getBean("name");
      var getAgeToPrint = applicationContext.getBean("age");
      var getAddressToPrint = applicationContext.getBean("address1");
        var getPersonToPrint = applicationContext.getBean("person");
        var getPersonWithExistingBean = applicationContext.getBean("personWithExistingBean");
        var getPersonWithExistingBeanAsParameter = applicationContext.getBean("personWithExistingBeanAsParameter");
        System.out.println(getNameToPrint);
        System.out.println(getAgeToPrint);
        System.out.println(getPersonToPrint);
        System.out.println(getAddressToPrint);
        System.out.println("persone with existing bean: "+getPersonWithExistingBean);
        System.out.println("persone with existing bean as parameter: "+getPersonWithExistingBeanAsParameter.toString());
        System.out.println("=============================================================");
        Arrays.stream(applicationContext.getBeanDefinitionNames()).toList().forEach(System.out::println);

        System.out.println("=============================================================");

        Address addressToFetch = applicationContext.getBean(Address.class);

        System.out.println(addressToFetch);



    }
}
