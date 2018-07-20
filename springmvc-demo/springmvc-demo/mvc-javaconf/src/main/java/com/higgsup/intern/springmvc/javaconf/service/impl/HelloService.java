package com.higgsup.intern.springmvc.javaconf.service.impl;

import com.higgsup.intern.springmvc.javaconf.model.Person;
import com.higgsup.intern.springmvc.javaconf.service.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    public Person getPerson() {
        return new Person("Titus", "Thieu");
    }
}
