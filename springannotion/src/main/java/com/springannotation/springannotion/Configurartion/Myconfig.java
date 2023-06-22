package com.springannotation.springannotion.Configurartion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan (basePackages = {"MyPack"})
public class Myconfig {
@Bean("s1")
    public Student getStudent(){
    System.out.println("Creating Student object");
     return new Student("Student 1");
    }
@Bean("s2")
@Lazy
    public Student createSomething(){
        System.out.println("Creating Student object");
        return new Student("Student 2");
    }

}
