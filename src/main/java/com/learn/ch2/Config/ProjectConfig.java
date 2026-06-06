package com.learn.ch2.Config;

import com.learn.ch2.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.ch2.model")
public class ProjectConfig {

}
