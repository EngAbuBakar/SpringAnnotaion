package com.springannotation.springannotion.Configurartion;

import org.springframework.context.annotation.Bean;


public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void doingSomething(){
        System.out.println(this.name+" is studying");
    }

    public void createSomething()
    {

        System.out.println(this.name+" is creating some courses for the java spring boot learning purpose");
    }
}
