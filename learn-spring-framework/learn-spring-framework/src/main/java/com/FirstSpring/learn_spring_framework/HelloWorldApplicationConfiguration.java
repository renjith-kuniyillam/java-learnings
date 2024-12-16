package com.FirstSpring.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {};
record Address(String city, String state) {};

@Configuration
public class HelloWorldApplicationConfiguration {
    @Bean
    public String name() {
        return "Renjith";
    }
    @Bean
    public int age() {
        return 30;
    }

    @Bean int age2() {
        return 35;
    }

    @Bean
    public Person person() {
        return new Person("Renjith", 30);
    }
    @Bean(name = "address1")
    @Primary
    public Address address() {
        return new Address("Bangalore", "Karnataka");
    }

    @Bean(name = "address2")
    public Address address2() {
        return new Address("Netherlands", "Amsterdam");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("US", "California");
    }

    @Bean
    public Person personWithExistingBean() {
        return new Person(name(), age());
    }

    @Bean
    public  Person personWithExistingBeanAsParameter(String name, @Qualifier("age2") int age) {
        return new Person(name, age);
    }
}
