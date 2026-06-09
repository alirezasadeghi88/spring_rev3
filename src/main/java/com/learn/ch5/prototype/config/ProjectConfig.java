package com.learn.ch5.prototype.config;

import com.learn.ch5.prototype.service.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.learn.ch5.prototype.service",
"com.learn.ch5.prototype.repository"})
public class ProjectConfig {


}
