package com.learn.ch3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private Parrot1 parrot
            ;
    @Autowired
    public Person(Parrot1 parrot) {
        this.parrot = parrot;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot1 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot1 parrot) {
        this.parrot = parrot;
    }
}
