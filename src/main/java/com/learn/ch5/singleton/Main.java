package com.learn.ch5.singleton;

import com.learn.ch5.singleton.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);



    }
}
