package com.learn.ch3;

import com.learn.ch3.config.ProjectConfig;
import com.learn.ch3.model.Parrot1;
import com.learn.ch3.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);

        Person person = context.getBean(Person.class);


        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}

