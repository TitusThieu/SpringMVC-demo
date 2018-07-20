package com.higgsup.intern.springmvc.javaconf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.higgsup.intern.springmvc.javaconf.service")
public class ApplicationConfig {
}
