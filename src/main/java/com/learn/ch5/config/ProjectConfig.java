package com.learn.ch5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.ch5.service",
        resourcePattern = "com.learn.ch5.repository")
public class ProjectConfig {


}
