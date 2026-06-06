package com.learn.ch3.config;

import com.learn.ch3.model.Parrot1;
import com.learn.ch3.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.ch3.model")
public class ProjectConfig {


}

