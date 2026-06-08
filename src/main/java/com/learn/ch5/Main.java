package com.learn.ch5;

import com.learn.ch5.config.ProjectConfig;
import com.learn.ch5.service.CommentService;
import com.learn.ch5.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);


    }
}
